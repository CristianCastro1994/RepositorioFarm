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
public class DProveedor {
    private int IdProveedor;
    private String NombreProveedor;
    private String RUC;
    private int CI;
    private String Direccion;
    private int Telefono;
    private int Celular;
    private String Email;
    private String Observacion;
    private String CambiarBusqueda;
    
    public DProveedor(){
        
    }
    
    public DProveedor(int IdProveedor, String NombreProveedor, String RUC, int CI, String Direccion,
    int Telefono, int Celular, String Email, String Observacion, String CambiarBusqueda){
        this.IdProveedor = IdProveedor;
        this.NombreProveedor = NombreProveedor;
        this.RUC = RUC;
        this.CI = CI;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Email = Email;
        this.Observacion = Observacion;
        this.CambiarBusqueda = CambiarBusqueda;
    }
    
    public int getIdProveedor(){
        return IdProveedor;
    }
    
    public void setIdProveedor(int IdProveedor){
        this.IdProveedor = IdProveedor;
    }
    
    public String getNombreProveedor(){
        return NombreProveedor;
    }
    
    public void setNombreProveedor(String NombreProveedor){
        this.NombreProveedor = NombreProveedor;
    }
    
    public String getRUC(){
        return RUC;
    }
    
    public void setRuc(String RUC){
        this.RUC = RUC;
    }
    
    public int getCI(){
        return CI;
    }
    
    public void setCI(int CI){
        this.CI = CI;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    public int getTelefono(){
        return Telefono;
    }
    
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    
    public int getCelular(){
        return Celular;
    }
    
    public void setCelular(int Celular){
        this.Celular = Celular;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    
    public String getObservacion(){
        return Observacion;
    }
    
    public void setObsevacion(String Observacion){
        this.Observacion = Observacion;
    }
    
    public String getCambiarBusqueda(){
        return CambiarBusqueda;
    }
    
    public void setCambiarBusqueda(String CambiarBusqueda){
        this.CambiarBusqueda = CambiarBusqueda;
    }
}
