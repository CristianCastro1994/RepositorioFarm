/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;


import Conexion.Conexion;
import Datos.DEmpleado;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class CEmpleado {
     private Conexion mysql = new Conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    private String sSQL2 = "";
    public Integer totalRegistros; // Obtener los registros

    
    public void consultar(DEmpleado datos) throws SQLException{
        
        //En este conjunto de codigos lo que hago es llamar al procedimiento almacenado "RevisarUsuario" 
        //que se encuentra en la base de datos, el cual revisa si existe un usuario en la BD 
        //Si el procedimiento almacenado me devuelve 1 es porque existe y 0 es porque no. 
        try {
            int acceso;
           CallableStatement cs = cn.prepareCall("{call RevisarUsuario(?,?,?)}");
           cs.setString(1, datos.getLogin());
           cs.setString(2, datos.getPassword());

           
           cs.registerOutParameter(3, java.sql.Types.INTEGER);
           cs.execute();
           System.out.println("Este = "+ cs.getInt(3));
//           
           acceso = cs.getInt(3);
           
            if (acceso == 1) {
                JOptionPane.showMessageDialog(null, "Bienvenido "+ datos.getLogin());
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña o Usuario Incorrecto");
            }
           
           
        } catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null, e);
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
