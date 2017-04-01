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
public class DCategoria {
    private int IdCategoria;
    private String Descripcion;
    private String cambiarBusqueda;
    
    public DCategoria(){
        
    }
    
    public DCategoria(int IdCategoria, String Descripcion, String cambiarBusqueda){
        this.IdCategoria = IdCategoria;
        this.Descripcion = Descripcion;
        this.cambiarBusqueda = cambiarBusqueda;
    }
    
    public int getIdCategoria(){
        return IdCategoria;
    }
    
    public void setIdCategoria(int IdCategoria){
        this.IdCategoria = IdCategoria;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    
    public String getCambiarBusqueda(){
        return cambiarBusqueda;
    }
    
    public void setCambiarBusqueda(String cambiarBusqueda){
        this.cambiarBusqueda = cambiarBusqueda;
    }
}
