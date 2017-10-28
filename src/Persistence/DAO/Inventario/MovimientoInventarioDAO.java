/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.DAO.Inventario;

import Persistence.Entidades.Inventario.MovimientoInventario;
import java.util.Date;

/**
 *
 * @author Bryan
 */
public class MovimientoInventarioDAO {
    private MovimientoInventario movimiento;

    public MovimientoInventarioDAO() {
    }    

    private boolean crear(MovimientoInventario movimiento) {
       //medodo de conección a BD
        return true;
    }
    
    private boolean consultar(Date fecha)
    {
        //medodo de conección a BD
        return true;
    }

    private boolean eliminar(int id) {
       //medodo de conección a BD
        return true;
    }
}
