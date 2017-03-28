/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DCalculoVuelto;
import Datos.DVenta;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class FCalculoVuelto {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
   
    
    public boolean calcularVuelto(DCalculoVuelto datos){
        
        try {
            CallableStatement cs = cn.prepareCall("{Call CalcularVuelto(?,?)}");
            cs.setDouble("_efectivo", datos.getEfectivo());
            cs.setInt("_codigoCotizacion", datos.getCodigoMoneda());
            cs.execute();
            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public double mostrarVuelto(){
         DCalculoVuelto datos = new DCalculoVuelto();
         String sSQL;
         double Vuelto = 0;
         
        sSQL = "SELECT vuelto FROM ventas"
                + " WHERE CodigoVenta = (SELECT MAX(CodigoVentaFK) FROM detalle_venta)" ;

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                 Vuelto = rs.getDouble("Vuelto");
                               
            }
            
            datos.setVuelto(Vuelto);
            
           
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        return Vuelto;
     }
    
}
