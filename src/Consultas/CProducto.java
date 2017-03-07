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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class CProducto {
    int totalRegistros = 0;
    String sSQL;
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
     public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"COD", "Nombre", "Direccion","Telefono","Email","Cedula","Login","pass","Estado","Acceso"};

        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.cod_persona , p.nombre_persona , p.direccion,p.telefono , "
                + "p.email,u.rut_usuario,u.login,u.password,u.estado ,u.acceso from "
                + " persona p inner join usuario u on p.cod_persona = u.cod_usuario "
                + " where nombre_persona like '%" + buscar + "%' order by cod_persona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_persona");
                registros[1] = rs.getString("nombre_persona");
                registros[2] = rs.getString("direccion");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("email");
                registros[5] = rs.getString("rut_usuario");
                registros[6] = rs.getString("login");
                registros[7] = rs.getString("password");
                registros[8] = rs.getString("estado");
                registros[9] = rs.getString("acceso");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}
