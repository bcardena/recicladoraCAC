/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Login;

/**
 *
 * @author Bryan
 */
public class Login {
    private String usuario;
    private String pass;

    public Login() {
    }

    public Login(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    private boolean validarUsuario(String usuario, String pass)
    {
         try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
