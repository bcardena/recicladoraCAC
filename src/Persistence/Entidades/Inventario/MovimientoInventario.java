/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Entidades.Inventario;

import java.util.Date;

/**
 *
 * @author Bryan
 */
public class MovimientoInventario {
    private int id;
    private String concepto;
    private String tipo;
    private Date fecha;
    private int cantidadMaterial;
    private int idMaterial;

    public MovimientoInventario() {
    }

    public MovimientoInventario(int id, String concepto, String tipo, Date fecha, int cantidadMaterial, int idMaterial) {
        this.id = id;
        this.concepto = concepto;
        this.tipo = tipo;
        this.fecha = fecha;
        this.cantidadMaterial = cantidadMaterial;
        this.idMaterial = idMaterial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(int cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }
       
    
    
    
}
