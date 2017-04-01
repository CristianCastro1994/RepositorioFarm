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
public class DCompra {
    private String TipoComprobante;
    private double TotalCompra;
    private String NumeroComprobante;
    private static int CodigoProveedor;
    
    public DCompra(){
        
    }
    
    public DCompra(String TipoComprobante,double TotalCompra,String NumeroComprobante, int CodigoProveedor){
        this.TipoComprobante = TipoComprobante;
        this.TotalCompra = TotalCompra;
        this.NumeroComprobante = NumeroComprobante;
        DCompra.CodigoProveedor = CodigoProveedor;
    }

    public String getTipoComprobante() {
        return TipoComprobante;
    }

    public void setTipoComprobante(String TipoComprobante) {
        this.TipoComprobante = TipoComprobante;
    }

    public double getTotalCompra() {
        return TotalCompra;
    }

    public void setTotalCompra(double TotalCompra) {
        this.TotalCompra = TotalCompra;
    }

    public String getNumeroComprobante() {
        return NumeroComprobante;
    }

    public void setNumeroComprobante(String NumeroComprobante) {
        this.NumeroComprobante = NumeroComprobante;
    }

    public int getCodigoProveedor() {
        return CodigoProveedor;
    }

    public void setCodigoProveedor(int CodigoProveedor) {
        this.CodigoProveedor = CodigoProveedor;
    }
    
    
    
}
