/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Personas;

import Domain.DTO.Personas.PersonaDTO;

/**
 *
 * @author Bryan
 */
public class Persona {
    PersonaDTO persona;
    
    private boolean crear(PersonaDTO persona)
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
