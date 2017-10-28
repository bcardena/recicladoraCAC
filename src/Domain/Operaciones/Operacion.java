/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Operaciones;

import Domain.DTO.Operaciones.OperacionDTO;

/**
 *
 * @author Bryan
 */
public class Operacion {
    OperacionDTO operacion;
    
    private Double calcularTotal(double valor, double descuento)
    {
        return valor - descuento;
    }
    
    private OperacionDTO consultar(int cod)
    {
        return operacion;
    }
    
    private boolean crear(OperacionDTO operacion)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean anular(int cod)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
