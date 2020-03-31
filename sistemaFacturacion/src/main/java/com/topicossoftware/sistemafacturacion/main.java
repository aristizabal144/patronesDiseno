/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;
import com.topicossoftware.dao.*;
import com.topicossoftware.conexion.Persistencia;
import com.topicossoftware.factory.*;
import com.topicossoftware.interfacez.*;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroFactura = 0;
        
        FacturaDao dao = new FacturaDaoImplementacion();
        
        //Crear tipoItems
        for (int i = 0; i < 2; i++) {
            TipoItem itemT = new TipoItem(i, "descripcion"+i);
            Persistencia.getInstance().PersistenciaTipoItems.add(itemT);
        }
        
        //Crear Items
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, Persistencia.getInstance().PersistenciaTipoItems.get(0), "ARTICULO"+i, i*100);
            Persistencia.getInstance().PersistenciaItems.add(item);
        }
        
        InterfazFabricaAbstracta fGeneral = FabricaGeneral.getFactory("CLIENTE");
        InterfazCliente c1 = fGeneral.getTipoCliente("corriente", 0, "PACHO", "HERREREA", "MASCULINO", "20/20/20", "SOLTERO");
        Persistencia.getInstance().PersistenciaClientes.add(c1.getCliente());
        InterfazCliente c2 = fGeneral.getTipoCliente("premium", 1, "ADRIANA", "GIRALDO", "FEMENINO", "10/10/10", "CASADA");
        Persistencia.getInstance().PersistenciaClientes.add(c2.getCliente());
        
        while (true) {            
            System.out.println("------------------------------------");
            System.out.println("SISTEMA FACTURACION");
            System.out.println("------------------------------------");
            System.out.println("DIGITE LA OPCION QUE DESEA REALIZAR");
            System.out.println("1-CREAR FACTURA");
            System.out.println("2-LEER FACTURA");
            System.out.println("3-EDITAR FACTURA");
            System.out.println("4-ELIMINAR FACTURA");

            Scanner scan = new Scanner(System.in);
            String option = scan.nextLine();

            switch (option) {
                case "1":
                        dao.crearFactura(numeroFactura);
                        numeroFactura++;
                    break;

                case "2":
                    System.err.println("INGRESA EL ID DE LA FACTURA");
                    int id_factura = scan.nextInt();
                    dao.leerFactura(id_factura);
                    break;

                case "3":

                    break;

                case "4":
                    System.err.println("INGRESA EL ID DE LA FACTURA A ELIMINAR");
                    int id_factura_eliminar = scan.nextInt();
                    dao.eliminarFactura(id_factura_eliminar);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
}
