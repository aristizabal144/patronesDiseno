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
public class Cliente {
    
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected String Genero;
    protected String Nacimiento;
    protected String civil;

    
    public Cliente(int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Nacimiento = Nacimiento;
        this.civil = civil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }
    
    
    
}
