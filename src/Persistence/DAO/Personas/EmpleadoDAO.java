/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Personas;

import Persistence.Entidades.Personas.Empleado;

/**
 *
 * @author Bryan
 */
public class EmpleadoDAO {
     Empleado empleado;
    
    private boolean crear(Empleado empleado)
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
    
    private boolean actualizar(int id, String cargo, double salario, String nombre)
    {
        return true;
    }
}
