/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import Conexion.Conexion;
import Datos.DEmpleado;
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
 
    
    public boolean consultar(DEmpleado datos) {
        int acceso;
        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "RevisarUsuario" 
        //que se encuentra en la base de datos, el cual revisa si existe un usuario en la BD 
        //Si el procedimiento almacenado me devuelve 1 es porque existe y 0 es porque no. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call InsertarProducto(?,?,?,?,?,?,?,?,?,?,?)}");
           cs.setString(1, datos.getLogin());
           cs.setString(2, datos.getPassword());

           
           cs.registerOutParameter(3, java.sql.Types.INTEGER);
           cs.execute();
           System.out.println("Este = "+ cs.getInt(3));
//           
           acceso = cs.getInt(3);
           
            if (acceso == 1) {
               
                return true;
                
                
            } else {
                
                return false;
            }
           
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
     public boolean insertar(DEmpleado datos) {

        
        try {
            
            CallableStatement cs = cn.prepareCall("{call InsertarUsuario(?,?,?)}");
           cs.setString(2, datos.getNombres());
           cs.setString(3, datos.getApellidos());
           cs.setString(4, datos.getSexo());
//           cs.setDate(4, datos.getFechaNacimiento().toString());
           cs.setString(6,datos.getDireccion());
           cs.setInt(7, datos.getTelefono());
           cs.setInt(8, datos.getCI());
           //Falta Fecha Ingreso
           cs.setString(10, datos.getEmail());
           cs.setDouble(11, datos.getSueldo());
           cs.setString(13, datos.getEstado());
           cs.setString(13, datos.getLogin());
           cs.setString(14, datos.getPassword());
           cs.setString(15, datos.getAcceso());
           
           
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
