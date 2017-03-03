/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Richard
 */
public class DEmpleado {
    private int Codigo_Empleado;
    private String Nombres;
    private String Apellidos;
    private String Sexo;
    private Date FechaNacimento;
    private String Direccion;
    private int Telefono;
    private int Celular;
    private int CI;
    private Date FechaIngreso;
    private String Email;
    private Double Sueldo;
    private String Estado;
    private String Login;
    private String Password;
    private String Acceso;
    
    public DEmpleado(){
        
    }
    
    public DEmpleado(int Codigo_Empleado, String Nombres, String Apellidos, String Sexo, Date FechaNacimiento, String Direccion, int Telefono
    , int Celular, int CI, Date FechaIngreso, String Email, Double Sueldo, String Estado, String Login, String Password, String Acceso){
        
        this.Codigo_Empleado = Codigo_Empleado;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.FechaNacimento = FechaNacimiento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.CI = CI;
        this.FechaIngreso = FechaIngreso;
        this.Email = Email;
        this.Sueldo = Sueldo;
        this.Estado = Estado;
        this.Login = Login;
        this.Password = Password;
        this.Acceso = Acceso; 
        
    }
    
    public int getCodigo_Empleado() {
        return Codigo_Empleado;
    } 
    
    public void setCodigo_Empleado(int Codigo_Empleado) {
        this.Codigo_Empleado = Codigo_Empleado;
    }
    
    public String getNombres(){
        return Nombres;
    }
    
    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }
    
    public String getApellidos(){
        return Apellidos;
    }
    
    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;
    }
    
    public String getSexo(){
        return Sexo;
    }
    
    public void setSexo(String Sexo){
        this.Sexo = Sexo;
    }
    
    public Date getFechaNacimiento(){
        return FechaNacimento;
    }
    
    public void setFechaNacimiento(Date FechaNacimiento){
        this.FechaNacimento = FechaNacimiento;
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
    
    public int getCI(){
        return CI;
    }
    
    public void setCI(int CI){
        this.CI = CI; 
    }
    
    public Date getFechaIngreso(){
        return FechaIngreso;
    }
    
    public void setFechaIngreso(Date FechaIngreso){
        this.FechaIngreso = FechaIngreso;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public Double getSueldo(){
        return Sueldo;
    }
    
    public void setSueldo(Double Sueldo){
        this.Sueldo = Sueldo;
    }
            
    public String getEstado(){
        return Estado;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    
    public String getLogin(){
        return Login;
    }
    
    public void setLogin(String Login){
        this.Login = Login;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String getAcceso(){
        return Acceso;
    }
    
    public void setAcceso(String Acceso){
        this.Acceso = Acceso;
    }
}
