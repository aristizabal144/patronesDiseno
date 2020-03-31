/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.factory;
import com.topicossoftware.interfacez.InterfazCliente;
import com.topicossoftware.interfacez.InterfazFabricaAbstracta;
import com.topicossoftware.interfacez.InterfazFactura;
import com.topicossoftware.sistemafacturacion.Cliente;
import com.topicossoftware.sistemafacturacion.FacturaIva;
import com.topicossoftware.sistemafacturacion.FacturaNoIva;
import com.topicossoftware.sistemafacturacion.Item;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class FabricaAbsFacturas implements InterfazFabricaAbstracta{

    @Override
    public InterfazFactura getTipoFactura(String factura, int nro_Factura, String fecha_factura, Cliente cliente, double total_factura, String estado, ArrayList<Item> items) {
        if(factura.equalsIgnoreCase("con_iva")){
            return new FacturaIva(nro_Factura, fecha_factura, cliente, total_factura, estado, items);
        }
        if(factura.equalsIgnoreCase("sin_iva")){
            return new FacturaNoIva(nro_Factura, fecha_factura, cliente, total_factura, estado, items);
        }
        
        return null;
    }
    
    @Override
    public InterfazCliente getTipoCliente(String cliente, int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil) {
        return null;
    }
}
