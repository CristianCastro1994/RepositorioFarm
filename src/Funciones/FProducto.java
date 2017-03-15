/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DEmpleado;
import Datos.DProducto;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class FProducto {
    String sSQL;
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
 
    
    public boolean insertar(DProducto datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "InsertarUsuario" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de guardarlos en la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call InsertarProducto(?,?,?,?,?,?,?,?,?)}");
           cs.setInt("_codigoMedicamentos", datos.getCodigo());
           cs.setString("_nombre", datos.getNombre());
           cs.setString("_descripcion", datos.getDescripcion());
           cs.setString("_sitio", datos.getSitio());
           cs.setDouble("_limite", datos.getLimite());
           cs.setDouble("_precio", datos.getPrecio());
           cs.setString("_presentacion", datos.getCategoria());

           cs.setDate("_vencimiento", datos.getVencimiento());
           cs.setBlob("_imagen", datos.getImagen());
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
    public boolean modificar(DProducto datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "InsertarUsuario" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de guardarlos en la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call ModificarProducto(?,?,?,?,?,?,?,?,?)}");
           cs.setInt("_codigoMedicamentos", datos.getCodigo());
           cs.setString("_nombre", datos.getNombre());
           cs.setString("_descripcion", datos.getDescripcion());
           cs.setString("_sitio", datos.getSitio());
           cs.setDouble("_limite", datos.getLimite());
           cs.setDouble("_precio", datos.getPrecio());
           cs.setString("_presentacion", datos.getCategoria());
          
           cs.setDate("_vencimiento", datos.getVencimiento());
           cs.setBlob("_imagen", datos.getImagen());
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
    
    
    public boolean eliminar(DProducto datos) {

        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "EliminarProducto" 
        //que se encuentra en la base de datos, el cual le manda los datos ingresados en el JFrame
        //y este PA se encarga de eliminarlos de la base de datos. 
        try {
            
           CallableStatement cs = cn.prepareCall("{call EliminarProducto(?)}");
           cs.setInt("_codigoMedicamentos", datos.getCodigo());
           
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
     public DefaultTableModel mostrar(String buscar, DProducto datos) {
         
        DefaultTableModel modelo;

        String[] titulos = {"Codigo", "Nombre", "Descripcion","Sitio","Stock","Limite","Precio","Vencimiento"};

        String[] registros = new String[10];
        
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select CodigoMedicamentos , Nombre,  Descripcion , "
                + " Sitio, Stock, Limite, Precio ,Vencimiento FROM medicamentos "
                + " where "+ datos.getcambiarBusqueda() +" like '" + buscar +"%'";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("CodigoMedicamentos");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Descripcion");
                registros[3] = rs.getString("Sitio");
                registros[4] = rs.getString("Stock");
                registros[5] = rs.getString("Limite");
                registros[6] = rs.getString("Precio");
                registros[7] = rs.getString("Vencimiento");
               
              
             
               
//               jLImagen.setIcon(new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_DEFAULT)));                 
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
     
     public Blob mostrarImagen(String codigo){
         
         Blob Imagen = null;
        sSQL = "select imagen FROM Medicamentos "
                + " where CodigoMedicamentos = " + codigo ;

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                Blob blob = rs.getBlob("imagen");
              
             
               
//                             
                Imagen = blob;
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return Imagen;
     }
     
     public DefaultComboBoxModel mostrarCategoria() {
         
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();

      

        String[] registros = new String[1];
        
        

        sSQL = "select * FROM categoria ";
                
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Descripcion");
                
                                
                 modelo.addElement(registros[0]);
            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
     
     public boolean modificarProducto(){
         return true;
     }
    
}
