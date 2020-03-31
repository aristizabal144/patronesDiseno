/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.factory;
import com.topicossoftware.factory.FabricaAbsFacturas;
import com.topicossoftware.interfacez.InterfazFabricaAbstracta;
/**
 *
 * @author Usuario
 */
public class FabricaGeneral {
    
    public static InterfazFabricaAbstracta getFactory(String tipo) {
        if(tipo.equalsIgnoreCase("CLIENTE")){
            return new FabricaAbsClientes();
        }
        if(tipo.equalsIgnoreCase("FACTURA")){
            return new FabricaAbsFacturas();
        }
        
        return null;
    }
}
