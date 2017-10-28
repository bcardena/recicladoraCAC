/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Operaciones;

import Persistence.Entidades.Operaciones.DetalleOperacion;

/**
 *
 * @author Bryan
 */
public class DetalleOperacionDAO {
    DetalleOperacion detalle;
    
    private boolean crear(DetalleOperacion detalle)
    {
        return true;
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

