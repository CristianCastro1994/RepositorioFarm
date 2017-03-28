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
    private int Cod_Cliente;
    private double cantidadDetalle;
    private double PrecioProducto;
    private double SubTotal;
    private String Comprobante;
    private static double Total;
    private static double TotalDolar;
    private static double TotalPeso;
    private static double TotalReal;
    public DVenta(int Cod_Venta, int Cod_Producto, int Cod_Cliente, double cantidadDetalle, double PrecioProducto, double SubTotal, String Comprobante,
            double Total, double TotalPeso, double TotalDolar, double TotalReal){
        this.Cod_Venta = Cod_Venta;
        this.Cod_Producto = Cod_Producto;
        this.Cod_Cliente = Cod_Cliente;
        this.cantidadDetalle = cantidadDetalle;
        this.PrecioProducto = PrecioProducto;
        this.SubTotal = SubTotal;
        this.Comprobante = Comprobante;
        this.Total = Total;
        this.TotalDolar = TotalDolar;
        this.TotalPeso = TotalPeso;
        this.TotalReal = TotalReal;
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
    
    public int getCod_Cliente(){
        return Cod_Cliente;
    }
    
    public void setCod_Cliente(int Cod_Cliente){
        this.Cod_Cliente = Cod_Cliente;
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
    
    public String getComprobante (){
        return Comprobante;
    }
    
    public void setComprobante (String Comprobante){
        this.Comprobante = Comprobante;
    }
    
    public double getTotal(){
        return Total;
    }
    
    public void setTotal(double Total){
        this.Total = Total;
    }
    
    public double getTotalDolar(){
        return TotalDolar;
    }
    
    public void setTotalDolar(double TotalDolar){
        this.TotalDolar = TotalDolar;
    }
    
    public double getTotalPeso(){
        return TotalPeso;
    }
    
    public void setTotalPeso(double TotalPeso){
        this.TotalPeso = TotalPeso;
    }
    
    public double getTotalReal(){
        return TotalReal;
    }
    
    public void setTotalReal(double TotalReal){
        this.TotalReal = TotalReal;
    }
}
