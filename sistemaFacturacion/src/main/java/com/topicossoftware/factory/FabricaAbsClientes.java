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
import com.topicossoftware.sistemafacturacion.ClienteCorriente;
import com.topicossoftware.sistemafacturacion.ClientePremium;
import com.topicossoftware.sistemafacturacion.Item;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class FabricaAbsClientes implements InterfazFabricaAbstracta{

    @Override
    public InterfazCliente getTipoCliente(String TipoCliente, int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil) {
        if(TipoCliente.equalsIgnoreCase("corriente")){
            return new ClienteCorriente(id, Nombre, Apellidos, Genero, Nacimiento, civil);
        }
        if(TipoCliente.equalsIgnoreCase("premium")){
            return new ClientePremium(id, Nombre, Apellidos, Genero, Nacimiento, civil);
        }
        
        return null;
    }

    @Override
    public InterfazFactura getTipoFactura(String factura, int nro_Factura, String fecha_factura, Cliente cliente, double total_factura, String estado, ArrayList<Item> items) {
        return null;
    }
    
    
}
