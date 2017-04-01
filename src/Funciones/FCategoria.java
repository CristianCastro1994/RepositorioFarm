/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DCategoria;
import Datos.DProveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class FCategoria {
    String sSQL;
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
 
    
    public boolean insertar(DProveedor datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "InsertarUsuario" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de guardarlos en la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call InsertarProveedor(?,?,?,?,?,?,?,?)}");
           cs.setString("_nombreProveedor", datos.getNombreProveedor());
           cs.setString("_ruc", datos.getRUC());
           cs.setInt("_ci", datos.getCI());
           cs.setString("_direccion", datos.getDireccion());
           cs.setInt("_telefono", datos.getTelefono());
           cs.setInt("_celular", datos.getCelular());
           cs.setString("_email", datos.getEmail());
           cs.setString("_observacion", datos.getObservacion());

         
           cs.execute();
           return true;
           
           
            
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
    public boolean modificar(DProveedor datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "InsertarUsuario" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de guardarlos en la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call ModificarProveedor(?,?,?,?,?,?,?,?)}");
           cs.setString("_nombreProveedor", datos.getNombreProveedor());
           cs.setString("_ruc", datos.getRUC());
           cs.setInt("_ci", datos.getCI());
           cs.setString("_direccion", datos.getDireccion());
           cs.setInt("_telefono", datos.getTelefono());
           cs.setInt("_celular", datos.getCelular());
           cs.setString("_email", datos.getEmail());
           cs.setString("_observacion", datos.getObservacion());
           
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
    
    public boolean eliminar(DProveedor datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "EliminarProducto" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de eliminarlos de la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call EliminarProveedor(?)}");
           cs.setInt("_idProveedor", datos.getIdProveedor());
           
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
     public DefaultTableModel mostrar(String buscar, DCategoria datos) {
         
        DefaultTableModel modelo;

        String[] titulos = {"Id", "Nombre", "RUC","CI","Direccion","Telefono","Celular","Email", "Observacion"};

        String[] registros = new String[10];
        
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select CodigoProveedor, NombreProveedor,  RUC, "
                + " CI, Direccion, Telefono, Celular ,Email, Observacion FROM proveedor "
                + " where "+ datos.getCambiarBusqueda()+" like '" + buscar +"%'";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("CodigoProveedor");
                registros[1] = rs.getString("NombreProveedor");
                registros[2] = rs.getString("RUC");
                registros[3] = rs.getString("CI");
                registros[4] = rs.getString("Direccion");
                registros[5] = rs.getString("Telefono");
                registros[6] = rs.getString("Celular");
                registros[7] = rs.getString("Email");
                registros[8] = rs.getString("Observacion");
               
               
              
             
               
//               jLImagen.setIcon(new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_DEFAULT)));                 
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
     
} 

