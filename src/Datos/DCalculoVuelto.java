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
public class DCalculoVuelto {
    private double efectivo;
    private int codigoMoneda;
    private double vuelto;
    
    public DCalculoVuelto(){
        
    }
    
    public DCalculoVuelto(double efectivo, int codigoMoneda, double vuelto){
        this.efectivo = efectivo;
        this.codigoMoneda = codigoMoneda;
        this.vuelto = vuelto;
    }
    
    public double getEfectivo(){
        return efectivo;
    }
    
    public void setEfectivo(double efectivo){
        this.efectivo = efectivo;
    }
    
    public int getCodigoMoneda(){
        return codigoMoneda;
    }
    
    public void setCodigoMoneda(int codigoMoneda){
        this.codigoMoneda = codigoMoneda;
    }
    
    public double getVuelto(){
        return vuelto;
    }
    
    public void setVuelto(double vuelto){
        this.vuelto = vuelto;
    }
    
}
