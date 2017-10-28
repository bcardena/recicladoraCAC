/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Personas;

import Domain.DTO.Personas.ClienteDTO;

/**
 *
 * @author Bryan
 */
public class Cliente extends Persona {
    ClienteDTO cliente;
    
    private boolean crear(ClienteDTO cliente)
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
    
    private boolean actualizar(int id, String tipo, String email)
    {
        return true;
    }
  
}
