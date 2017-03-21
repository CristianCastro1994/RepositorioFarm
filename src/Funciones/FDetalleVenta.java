/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DDetalleVenta;
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
public class FDetalleVenta {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL;
    
    public DefaultTableModel VistaDetalle(){
        
        DefaultTableModel modelo;
        String[] titulos = {"Nombre", "Cantidad","Precio","SubTotal"};
        String[] registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM VistaDetalle";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("CantidadDetalle");
                registros[2] = rs.getString("Precio");
                registros[3] = rs.getString("SubTotal");
                             
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarDetalleVenta(DDetalleVenta datosDetalle){
        try {
            CallableStatement cs = cn.prepareCall("{Call InsertarDetalle_Venta(?,?)}");
            cs.setFloat("_cantidadDetalle", datosDetalle.getcantidadDetalle());
            cs.setInt("_codigoProducto", datosDetalle.getcodigoProducto());
            cs.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Aca el problema");
            return false;
        }
    }
    
}
