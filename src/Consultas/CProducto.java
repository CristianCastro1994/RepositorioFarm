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
import java.sql.SQLException;
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
            
           CallableStatement cs = cn.prepareCall("{call InsertarProducto(?,?,?,?,?,?,?,?,?,?)}");
           cs.setInt("_codigoMedicamentos", datos.getCodigo());
           cs.setString("_nombre", datos.getNombre());
           cs.setString("_descripcion", datos.getDescripcion());
           cs.setString("_sitio", datos.getSitio());
           cs.setDouble("_cantidad", 0);
           cs.setDouble("_stock", 0);
           cs.setDouble("_limite", datos.getLimite());
           cs.setDouble("_precio", datos.getPrecio());
           cs.setDouble("_precioCosto", datos.getPrecioCosto());
           cs.setDate("_vencimiento", datos.getVencimiento());
           
           cs.execute();
           return true;
           
           
            
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
              return false;    
        }
         
  
    }
     public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"Codigo", "Nombre", "Descripcion","Sitio","Stock","Limite","Precio","Vencimiento"};

        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select CodigoMedicamentos , Nombre,  Descripcion , "
                + " Sitio, Stock, Limite, Precio ,Vencimiento FROM medicamentos "
                + " where CodigoMedicamentos like '%" + buscar +"%'";

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
