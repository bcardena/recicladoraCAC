/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Materiales;

import Domain.DTO.Materiales.MaterialDTO;

/**
 *
 * @author Bryan
 */
public class Material {
    private MaterialDTO material;

    public Material(MaterialDTO material) {
        this.material = material;
    }
    
    
    
    public boolean crear(MaterialDTO material)
    {
         try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public MaterialDTO consultar(int id)
    {
        return material;
    }
    
    public boolean modificar(int id, String nombre, Double precioC, Double precioV, String ubicacion, String estado)
    {
      try {
          material.setId(id);
          material.setNombre(nombre);
          material.setPrecioCompra(precioC);
          material.setPrecioVenta(precioV);
          material.setUbicacion(ubicacion);
          material.setEstado(estado);
          return true;
        } catch (Exception e) {
            return false;
        }
    }
}
