/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DTO.Operaciones;

/**
 *
 * @author Bryan
 */
public class DetalleOperacionDTO {
    private int id;
    private int codOperacion;
    private int idMaterial;
    private int cantidad;
    private Double valorUnitario;
    private Double valorTotal;

    public DetalleOperacionDTO() {
    } 

    public DetalleOperacionDTO(int id, int codOperacion, int idMaterial, int cantidad, Double valorUnitario, Double valorTotal) {
        this.id = id;
        this.codOperacion = codOperacion;
        this.idMaterial = idMaterial;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodOperacion() {
        return codOperacion;
    }

    public void setCodOperacion(int codOperacion) {
        this.codOperacion = codOperacion;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
            
}
