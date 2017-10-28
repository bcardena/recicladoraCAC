/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Personas;

import Persistence.Entidades.Personas.Proveedor;

/**
 *
 * @author Bryan
 */
public class ProveedorDAO {
     Proveedor proveedor;
    
    private boolean crear(Proveedor proveedor)
    {
      return true;
    }
    
    private boolean consultar(int id)
    {
        return true;
    }
    
    private boolean eliminar(int id)
    {
        return true;
    }
    
    private boolean actualizar(int id, String nombre, String direccion, String telefono)
    {
        return true;
    }
}
