/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Operaciones;

import Domain.DTO.Operaciones.DetalleOperacionDTO;

/**
 *
 * @author Bryan
 */
public class DetalleOperacion {
  DetalleOperacionDTO detalle;
  
  private Double calcularTotal(Double valor, int cantidad)
  {
      return valor * cantidad;
  }
  
  private boolean crear(DetalleOperacionDTO detalle)
  {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
  }
  
  private boolean eliminar(int id)
  {
       try {
            return true;
        } catch (Exception e) {
            return false;
        }
  }
}
