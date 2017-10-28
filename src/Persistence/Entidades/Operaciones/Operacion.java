/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Entidades.Operaciones;

import java.util.Date;

/**
 *
 * @author Bryan
 */
public class Operacion {
    private int cod;
    private int tipo;
    private Double valor;
    private Date fecha;
    private String estado;

    public Operacion() {
    }

    public Operacion(int cod, int tipo, Double valor, Date fecha, String estado) {
        this.cod = cod;
        this.tipo = tipo;
        this.valor = valor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
