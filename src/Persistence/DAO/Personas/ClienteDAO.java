/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Personas;

import Persistence.Entidades.Personas.Cliente;

/**
 *
 * @author Bryan
 */
public class ClienteDAO {
    Cliente cliente;
     private boolean crear(Cliente cliente)
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
    
    private boolean actualizar(int id, String tipo, String email, String nombre)
    {
      return true;
    }
}
