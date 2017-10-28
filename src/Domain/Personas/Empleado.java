/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Personas;

import Domain.DTO.Personas.EmpleadoDTO;

/**
 *
 * @author Bryan
 */
public class Empleado extends Persona {
    EmpleadoDTO empleado;
    
    private boolean crear(EmpleadoDTO empleado)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private EmpleadoDTO consultar(int id)
    {
        return empleado;
    }
    
    private boolean eliminar(int id)
    {
        try {
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean actualizar(int id, String cargo, double salario)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
