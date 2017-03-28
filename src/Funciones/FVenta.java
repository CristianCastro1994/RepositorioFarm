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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public boolean mostrarCalculo(){
         DVenta datos = new DVenta();
         String sSQL;
         double Total = 0, TotalDolar=0, TotalPeso=0, TotalReal=0;
         
        sSQL = "select TotalVenta, TotalDolar, TotalReal, TotalPeso FROM ventas"
                + " where CodigoVenta = (SELECT MAX(CodigoVentaFK) FROM detalle_venta)" ;

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                 Total = rs.getDouble("TotalVenta");
                 TotalDolar = rs.getDouble("TotalDolar");
                 TotalPeso = rs.getDouble("TotalPeso");
                 TotalReal = rs.getDouble("TotalReal");                
            }
            
            datos.setTotal(Total);
            datos.setTotalDolar(TotalDolar);
            datos.setTotalPeso(TotalPeso);
            datos.setTotalReal(TotalReal);
            
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
     }

    
}
