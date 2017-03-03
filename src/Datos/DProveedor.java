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
    private String NombreProveedor;
    private String RUC;
    private String Direccion;
    private int Telefono;
    private int Celular;
    private String Email;
    private int NCuenta;
    private int NCuenta2;
    private String Observacion;
    
    public DProveedor(String NombreProveedor, String RUC, String Direccion,
    int Telefono, int Ceular, String Email, int NCuenta, int Ncuenta2, String Observacion){
        
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
    
    public int getNCuenta(){
        return NCuenta;
    }
    
    public void setNcuenta(int NCuenta){
        this.NCuenta = NCuenta;
    }
    
    public int getNCuenta2(){
        return NCuenta2;
    }
    
    public void setNcuenta2(int Ncuenta2){
        this.NCuenta2 = Ncuenta2;
    }
    
    public String getObservacion(){
        return Observacion;
    }
    
    public void setObsevacion(String Observacion){
        this.Observacion = Observacion;
    }
}
