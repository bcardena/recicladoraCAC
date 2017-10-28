/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.DTO.Personas;

/**
 *
 * @author Bryan
 */
public class EmpleadoDTO {
    private int cod;
    private String cargo;
    private Double salario;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int cod, String cargo, Double salario) {
        this.cod = cod;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
