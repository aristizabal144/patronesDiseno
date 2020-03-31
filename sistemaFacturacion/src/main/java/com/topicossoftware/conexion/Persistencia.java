/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.conexion;
import java.util.ArrayList;
import com.topicossoftware.sistemafacturacion.*;
/**
 *
 * @author Usuario
 */
public class Persistencia {
    
   private static Persistencia instancia;
   public  ArrayList<Cliente> PersistenciaClientes;
   public  ArrayList<Factura> PersistenciaFactura;
   public  ArrayList<Item> PersistenciaItems;
   public  ArrayList<TipoItem> PersistenciaTipoItems;
   
   private Persistencia(){
        PersistenciaClientes = new ArrayList<>();
        PersistenciaFactura = new ArrayList<>();
        PersistenciaItems = new ArrayList<>();
        PersistenciaTipoItems = new ArrayList<>();
   }
    
   public static Persistencia getInstance(){
       if(instancia == null){
           instancia = new Persistencia();
       }
       return instancia;
   }
   
   public void conectar(){
       System.out.println("conecto");
   }

}
