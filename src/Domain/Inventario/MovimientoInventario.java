/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Inventario;

import Domain.DTO.Inventario.MovimientoInventarioDTO;
import java.util.Date;

/**
 *
 * @author Bryan
 */
public class MovimientoInventario  {

    private MovimientoInventarioDTO movimiento;

    public MovimientoInventario() {
    }    

    private boolean crear(MovimientoInventarioDTO movimiento) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private MovimientoInventarioDTO consultar(Date fecha)
    {
        return movimiento;
    }

    private boolean eliminar(MovimientoInventarioDTO movimiento) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
