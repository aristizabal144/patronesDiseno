/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.interfacez;

import com.topicossoftware.sistemafacturacion.Cliente;
import com.topicossoftware.sistemafacturacion.Item;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface InterfazFabricaAbstracta {
    InterfazCliente getTipoCliente(String Tipocliente, int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil);
    InterfazFactura getTipoFactura(String factura, int nro_Factura, String fecha_factura, Cliente cliente, double total_factura, String estado, ArrayList<Item> items);
}
