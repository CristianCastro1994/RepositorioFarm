/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import Conexion.Conexion;
import Datos.DEmpleado;
import Datos.DProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class CProducto {
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
 
    
    public boolean insertar(DProducto datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "InsertarUsuario" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de guardarlos en la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call InsertarProducto(?,?,?,?,?,?,?,?,?,?,?)}");
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           cs.setString(1, datos.getNombre());
           
           
           if (cs.execute()) {
                    return true;
                } else {
               return false;
                }
           
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
    
}
