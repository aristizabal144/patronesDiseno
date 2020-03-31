/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;
import com.topicossoftware.interfacez.InterfazCliente;
/**
 *
 * @author Usuario
 */
public class ClienteCorriente extends Cliente implements InterfazCliente{

    public ClienteCorriente(int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil) {
        super(id, Nombre, Apellidos, Genero, Nacimiento, civil);
    }
    
    
    @Override
    public String getToken_prioridad() {
        return "No existe";
    }
    
    @Override
    public Cliente getCliente() {
        return this;
    }
}
