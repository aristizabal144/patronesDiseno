/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;

import java.util.ArrayList;
import com.topicossoftware.interfacez.InterfazFactura;

/**
 *
 * @author Usuario
 */
public class FacturaIva extends Factura implements InterfazFactura{

    public FacturaIva(int nro_Factura, String fecha_factura, Cliente cliente, double total_factura, String estado, ArrayList<Item> items) {
        super(nro_Factura, fecha_factura, cliente, total_factura, estado, items);
    }
    
    @Override
    public int getIva() {
        return 0;
    }
    
    @Override
    public Factura getFactura() {
        return this;
    }
}
