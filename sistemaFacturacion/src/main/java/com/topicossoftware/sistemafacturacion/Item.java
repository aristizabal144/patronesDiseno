/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;

/**
 *
 * @author Usuario
 */
public class Item {
    
    private  int id;
    private TipoItem tipo_item;
    private String descripcion;
    private double valor_unidad;

    public Item(int id, TipoItem tipo_item, String descripcion, double valor_unidad) {
        this.id = id;
        this.tipo_item = tipo_item;
        this.descripcion = descripcion;
        this.valor_unidad = valor_unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoItem getTipo_item() {
        return tipo_item;
    }

    public void setTipo_item(TipoItem tipo_item) {
        this.tipo_item = tipo_item;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor_unidad() {
        return valor_unidad;
    }

    public void setValor_unidad(double valor_unidad) {
        this.valor_unidad = valor_unidad;
    }
    
    
    
}
