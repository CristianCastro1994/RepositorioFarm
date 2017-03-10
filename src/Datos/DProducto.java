/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author Richard
 */
public class DProducto {
    private int Codigo;
    private String Nombre;
    private String Descripcion;
    private String Sitio;
    private double Cantidad;
    private double Stock;
    private double Limite;
    private double Precio;
    private String Categoria;
    private double PrecioCosto;
    private Date Vencimiento;
    
    public DProducto(int Codigo, String Nombre, String Descripcion,
            String Sitio, double Cantidad, double Stock, double Limite,
            double Precio, String Categoria, double PrecioCosto, Date Vencimiento){
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Sitio = Sitio;
        this.Cantidad = Cantidad;
        this.Stock = Stock;
        this.Limite = Limite;
        this.Precio = Precio;
        this.Categoria = Categoria;
        this.PrecioCosto = PrecioCosto;
        this.Vencimiento = Vencimiento;
        
    }

    public DProducto() {
        
    }
    public int getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    
     public String getNombre() {
        return Nombre;
    } 
     
      public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     
     public String getDescripcion() {
         return Descripcion;
     }
     
     public void setDescripcion(String Descripcion){
         this.Descripcion = Descripcion;
     }
     
     public String getSitio() {
         return Sitio;
     }
     
     public void setSitio(String Sitio){
         this.Sitio = Sitio;
     }
     public double getCantidad() {
         return Cantidad;
     }
     
     public void setCantidad(double Cantidad){
         this.Cantidad = Cantidad;
     }
     
     public double getStock() {
         return Stock;
     }
     
     public void setStock(double Stock){
         this.Stock = Stock;
     }
     
     public double getLimite(){
         return Limite;
     }
     
     public void setLimite(double Limite){
         this.Limite = Limite;
     }
     
     public double getPrecio(){
         return Precio;
     }
     
     public void setPrecio(double Precio){
         this.Precio = Precio;
     }
     
     public String getCategoria(){
         return Categoria;
     }
     
     public void setCategoria(String Categoria){
         this.Categoria = Categoria;
     }
     
     public double getPrecioCosto(){
         return PrecioCosto;
     }
     
     public void setPrecioCosto(double PrecioCosto){
         this.PrecioCosto = PrecioCosto;
     }
     
     public Date getVencimiento(){
         return Vencimiento;
     }
     
     public void setVencimiento(Date Vencimiento){
         this.Vencimiento = Vencimiento;
     }
}
