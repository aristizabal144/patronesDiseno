/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Factura {
    
    private int nro_Factura;
    private String fecha_factura;
    private Cliente cliente;
    private double total_factura;
    private String estado;
    private ArrayList<Item> items;

    public Factura(int nro_Factura, String fecha_factura, Cliente cliente, double total_factura, String estado, ArrayList<Item> items) {
        this.nro_Factura = nro_Factura;
        this.fecha_factura = fecha_factura;
        this.cliente = cliente;
        this.total_factura = total_factura;
        this.estado = estado;
        this.items = items;
    }

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(double total_factura) {
        this.total_factura = total_factura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
    
    
    
}
