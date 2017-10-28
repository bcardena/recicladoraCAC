/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Personas;

import Domain.DTO.Personas.ProveedorDTO;

/**
 *
 * @author Bryan
 */
public class Proveedor extends Persona{
     ProveedorDTO proveedor;
    
    private boolean crear(ProveedorDTO proveedor)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private ProveedorDTO consultar(int id)
    {
        return proveedor;
    }
    
    private boolean eliminar(int id)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean actualizar(int id, String telefono, String direccion)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
