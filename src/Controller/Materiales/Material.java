/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Materiales;

import Domain.DTO.Materiales.MaterialDTO;

/**
 *
 * @author Bryan
 */
public class Material {

    public Material() {
    }
   
    public boolean Registrar(int id, String nombre, Double precioCompra, Double precioVenta, String ubicacion, String estado)
    {
        MaterialDTO materialDTO = new MaterialDTO(id, nombre, precioCompra, precioVenta, ubicacion, estado);
        Domain.Materiales.Material mat = new  Domain.Materiales.Material(materialDTO);
        return mat.crear(materialDTO);
    }
}
