/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topicossoftware.dao;

import com.topicossoftware.sistemafacturacion.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface FacturaDao {
    
    void crearFactura(int nro_Factura);
    void leerFactura(int id);
    void editarFactura(int id, Cliente cliente);
    void eliminarFactura(int id);
}
