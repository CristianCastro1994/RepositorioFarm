/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Conexion.Conexion;
import Datos.DCliente;
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
public class FCliente {
    String sSQL;
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    public DefaultTableModel mostrar(String buscar, DCliente datos) {
         
        DefaultTableModel modelo;

        String[] titulos = {"Id Cliente", "Nombres", "Apellidos","CI/RUC","Domicilio","Email","Celular","Telefono"};

        String[] registros = new String[10];
        
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT Id_Cliente , Nombres,  Apellidos , "
                + " CI, Domicilio, Email, Celular ,Telefono FROM Cliente "
                + " where "+ datos.getcambiarBusqueda() +" like '" + buscar +"%'";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id_Cliente");
                registros[1] = rs.getString("Nombres");
                registros[2] = rs.getString("Apellidos");
                registros[3] = rs.getString("CI");
                registros[4] = rs.getString("Domicilio");
                registros[5] = rs.getString("Email");
                registros[6] = rs.getString("Celular");
                registros[7] = rs.getString("Telefono");
                               
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}
