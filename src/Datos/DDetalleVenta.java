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
public class DDetalleVenta {
    private float cantidadDetalle;
    private int codigoProducto;
    private double precioProducto;
    private double subTotal;
    
    
    public DDetalleVenta(float cantidadDetalle, int codigoProducto, double precioProducto, double subTotal){
        this.cantidadDetalle = cantidadDetalle;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.subTotal = subTotal;
    }
    
    public DDetalleVenta(){
        
    }
    public float getcantidadDetalle(){
        return cantidadDetalle;
    }
    
    public void setcantidadDetalle(float cantidadDetalle){
        this.cantidadDetalle = cantidadDetalle;
    }
    
    public int getcodigoProducto(){
        return codigoProducto;
    }
    
    public void setcodigoProducto (int codigoProducto){
      this.codigoProducto = codigoProducto;
    }
    
    public double getprecioProducto(){
        return precioProducto;
    }
    
    public void setprecioProducto(double precioProducto){
        this.precioProducto = precioProducto;
    }
    
    public double getsubTotal(){
        return subTotal;
    }
    
    public void setsubTotal(double subTotal){
        this.subTotal = subTotal;
    }
}
