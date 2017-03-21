/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import java.sql.Connection;
import Datos.DVenta;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Richard
 */
public class FVenta {
private Conexion mysql = new Conexion();
private Connection cn = mysql.conectar();

public boolean insertarVenta(DVenta datos){
    try {
        CallableStatement cs = cn.prepareCall("{Call InsertarVenta(?,?)}");
        cs.setInt("_CodigoClienteFK", datos.getCod_Cliente());
        cs.setString("_TipoComprobante", datos.getComprobante());
        
        cs.execute();
        return true;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
    
}

    
}
