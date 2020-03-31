/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.dao;

import com.topicossoftware.sistemafacturacion.Cliente;
import com.topicossoftware.sistemafacturacion.Factura;
import com.topicossoftware.sistemafacturacion.Item;
import com.topicossoftware.conexion.Persistencia;
import com.topicossoftware.factory.FabricaGeneral;
import com.topicossoftware.interfacez.InterfazFabricaAbstracta;
import com.topicossoftware.interfacez.InterfazFactura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FacturaDaoImplementacion implements FacturaDao{

    @Override
    public void crearFactura(int nro_Factura) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("INGRESE FECHA FACTURA");
        String fechaSeleccionada = scan.nextLine();
        
        System.out.println("SELECCIONE EL NUMERO DE CLIENTE PARA LA FACTURA");
        for (int i = 0; i < Persistencia.getInstance().PersistenciaClientes.size(); i++) {
            System.out.println(i+") "+Persistencia.getInstance().PersistenciaClientes.get(i).getNombre()+" "+Persistencia.getInstance().PersistenciaClientes.get(i).getApellidos());
        }
        int clienteNum = scan.nextInt();
        Cliente clienteSeleccionado = Persistencia.getInstance().PersistenciaClientes.get(clienteNum);
        
        System.out.println("INGRESE ESTADO DE LA FACTURA");
        String estadoSeleccionado = scan.nextLine();
        
        System.out.println("INGRESE EL ID DE LOS PRODUCTOS A AGREGAR Y CUANDO FINALICE OPRIMA '999'");
        for (int i = 0; i < Persistencia.getInstance().PersistenciaItems.size(); i++) {
            System.out.println(i+") "+Persistencia.getInstance().PersistenciaItems.get(i).getDescripcion());
        }
        int articuloNum = 0;
        ArrayList<Item> itemsAux = new ArrayList<>();
        while(articuloNum != 999){
            articuloNum = scan.nextInt();
            if(articuloNum != 999){
                itemsAux.add(Persistencia.getInstance().PersistenciaItems.get(articuloNum));
                System.out.println("AGREGADO CON EXITO");
            }
            
        }
        
        double totalActual = 0;
        
        for (int i = 0; i < itemsAux.size(); i++) {
            totalActual += itemsAux.get(i).getValor_unidad();
        } 
        
        System.out.println("SELECCIONE (1)=FACTURA IVA || (2)=FACTURA SIN IVA");
        int optionIva = scan.nextInt();
        InterfazFabricaAbstracta fFactura = FabricaGeneral.getFactory("FACTURA");

        if (optionIva == 1) {
            InterfazFactura factura = fFactura.getTipoFactura("con_iva", nro_Factura, fechaSeleccionada, clienteSeleccionado, totalActual, estadoSeleccionado, itemsAux);
            Persistencia.getInstance().PersistenciaFactura.add(factura.getFactura());
            System.out.println("FACTURA CREADA CON EXITO!");
        }else if(optionIva == 2){
            InterfazFactura factura = fFactura.getTipoFactura("sin_iva", nro_Factura, fechaSeleccionada, clienteSeleccionado, totalActual, estadoSeleccionado, itemsAux);
            Persistencia.getInstance().PersistenciaFactura.add(factura.getFactura());
            System.out.println("FACTURA CREADA CON EXITO!");
        }
        
        this.leerFactura(nro_Factura);
    }

    @Override
    public void leerFactura(int id) {
        try {
            Factura respuesta = Persistencia.getInstance().PersistenciaFactura.get(id);
            System.out.println("-----------------------------------------");
            System.out.println("FACTURA NRO: "+respuesta.getNro_Factura());
            System.out.println("-----------------------------------------");
            System.out.println("FACTURADO A: "+respuesta.getCliente().getNombre()+" "+respuesta.getCliente().getApellidos());
            System.out.println("-----------------------------------------");
            for (int i = 0; i < respuesta.getItems().size(); i++) {
                System.out.println(respuesta.getItems().get(i).getDescripcion()+"->"+"$"+respuesta.getItems().get(i).getValor_unidad());
            }
            System.out.println("-----------------------------------------");
            System.out.println("TOTAL: "+respuesta.getTotal_factura());
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
        } catch (Exception e) {
            System.out.println("NO SE HA ENCONTRADO LA FACTURA");
        }
    }

    @Override
    public void editarFactura(int id, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarFactura(int id) {
        try {
            Persistencia.getInstance().PersistenciaFactura.remove(id);
        } catch (Exception e) {
            System.out.println("NO SE HA ENCONTRADO LA FACTURA PARA ELIMINAR");
        }
    }
    
}
