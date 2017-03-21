/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DProducto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class FCotizacion {
    String sSQL;
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    
    
     public DefaultTableModel mostrar() {
         
        DefaultTableModel modelo;

        String[] titulos = {"Id", "Nombre", "Cambio"};

        String[] registros = new String[4];
        
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT Id_Cotizacion , Nombre,  Cambio FROM cotizacion ";
                
               

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id_Cotizacion");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Cambio");
//                           
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
