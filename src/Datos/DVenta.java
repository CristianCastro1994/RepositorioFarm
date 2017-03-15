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
public class DVenta {
    private int Cod_Venta;
    private int Cod_Producto;
    private double cantidadDetalle;
    private double PrecioProducto;
    private double SubTotal;
    
    public DVenta(int Cod_Venta, int Cod_Producto, double cantidadDetalle, double PrecioProducto, double SubTotal){
        this.Cod_Venta = Cod_Venta;
        this.Cod_Producto = Cod_Producto;
        this.cantidadDetalle = cantidadDetalle;
        this.PrecioProducto = PrecioProducto;
        this.SubTotal = SubTotal;
    }
    public DVenta(){
        
    }
    
    public int getCod_Venta(){
        return Cod_Venta;
    }
    
    public void setCod_Venta(int Cod_Venta){
        this.Cod_Venta = Cod_Venta;
    }
    
    public int getCod_Producto(){
        return Cod_Producto;
    }
    
    public void setCod_Producto(int Cod_Producto){
        this.Cod_Producto = Cod_Producto;
    }
    
    public double getCantidadDetalle(){
        return cantidadDetalle;
    }
    
    public void setCantidadDetalle(double cantidadDetalle){
        this.cantidadDetalle = cantidadDetalle;
    }
    
    public double getPrecioProducto(){
        return PrecioProducto;
    }
    
    public void setPrecioProducto(double PrecioProducto){
        this.PrecioProducto = PrecioProducto;
    }
    
    public double getSubTotal(){
        return SubTotal;
    }
    
    public void setSubTotal(double SubTotal){
        this.SubTotal = SubTotal;
    }
}
