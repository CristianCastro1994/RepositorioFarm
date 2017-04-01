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
public class DDetalleCompra {
    private int CodigoProducto;
    private double precioCompra;
  
    
    public DDetalleCompra(){
    
}
    public DDetalleCompra(int CodigoProducto, double precioCompra){
        this.CodigoProducto = CodigoProducto;
        this.precioCompra = precioCompra;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

 
    
    
    
}
