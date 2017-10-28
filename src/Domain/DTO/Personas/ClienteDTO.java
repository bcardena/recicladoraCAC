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
public class ClienteDTO {
    private int cod;
    private String tipo;
    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(int cod, String tipo, String email) {
        this.cod = cod;
        this.tipo = tipo;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
