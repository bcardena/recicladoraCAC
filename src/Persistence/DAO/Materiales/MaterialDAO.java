/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Materiales;

import Persistence.Entidades.Materiales.Material;

/**
 *
 * @author Bryan
 */
public class MaterialDAO {
   Material material;
    
 private boolean crear(Material material)
    {
        return true;
    }
    
    private boolean consultar(int id)
    {
        return true;
    }
    
    private boolean modificar(int id, String nombre, Double precioC, Double precioV, String ubicacion, String estado)
    {
        return true;
    }
}
