/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.sistemafacturacion;
import java.util.Random;
import com.topicossoftware.interfacez.InterfazCliente;
/**
 *
 * @author Usuario
 */
public class ClientePremium extends Cliente implements InterfazCliente{
    
    private String token_prioridad;
    
    public ClientePremium(int id, String Nombre, String Apellidos, String Genero, String Nacimiento, String civil) {
        super(id, Nombre, Apellidos, Genero, Nacimiento, civil);
        this.token_prioridad = this.generarToken();
    }
    
    public String generarToken(){
        Random rand = new Random(); //instance of random class
        int valor = 100;
        int int_random = rand.nextInt(valor);
        return this.Apellidos + int_random;
    }

    @Override
    public String getToken_prioridad() {
        return token_prioridad;
    }
    
    @Override
    public Cliente getCliente() {
        return this;
    }
}
