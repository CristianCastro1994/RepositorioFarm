/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;



/**
 *
 * @author Richard
 */
public class DCliente {
    private static int IdCliente;
    private String Nombres;
    private String Apellidos;
    private String CI;
    private String Domicilio;
    private String Email;
    private int Celular;
    private int Telefono;
    private String cambiarBusqueda;
    public DCliente(int IdCliente, String Nombres, String Apellidos, String CI, String Domicilio, String Email, int Celular, int Telefono, String cambiarBusqueda){
        this.IdCliente = IdCliente;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.CI = CI;
        this.Domicilio = Domicilio; 
        this.Email = Email;
        this.Celular = Celular;
        this.Telefono = Celular;
        this.cambiarBusqueda = cambiarBusqueda;
    }
    public DCliente(){
        
    }
    
    
    public int getIdCliente(){
        return IdCliente;
    }
    
    public void setIdCliente(int IdCliente){
        this.IdCliente = IdCliente;
    }
    
    public String getNombres(){
        return  Nombres;
    }
    
    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }
    
    public String getApellidos(){
        return Apellidos;
    }
    
    public void setApellidos (String Apellidos){
        this.Apellidos = Apellidos;
    }
    
    public String getCI(){
        return CI;
    }
    
    public void setCI (String CI){
        this.CI = CI;
    }
    
    public String getDomicilio(){
        return Domicilio;
    }
    
      public void setDomicilio (String Domicilio){
        this.Domicilio = Domicilio;
    }
    
    public String getEmail(){
        return Email;
    }
    
      public void setEmail (String Email){
        this.Email = Email;
    }
    
    public int getCelular(){
    return Celular;    
    }
    
      public void setCelular (int Celular){
        this.Celular = Celular;
    }
    
    public int getTelefono(){
        return Telefono;
    }
    
      public void setTelefono (int Telefono){
        this.Telefono = Telefono;
    }
      
      public String getcambiarBusqueda(){
          return cambiarBusqueda;
      }
      
      public void setcambiarBusqueda(String cambiarBusqueda){
          this.cambiarBusqueda = cambiarBusqueda;
      }
}
