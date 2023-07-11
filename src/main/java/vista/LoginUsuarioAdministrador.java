/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Usuario;
import modelo.UsuarioAdministrador;
import java.awt.Frame;
import vista.controladores.LoginUsuarioAdministradorControlador;


public class LoginUsuarioAdministrador extends LoginAbstracto {

    public LoginUsuarioAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new LoginUsuarioAdministradorControlador(this, "Aplicación para administradores"));
    }

    @Override
    public void mostrarTitulo(String titulo) {
        setTitle(titulo);
    }

    @Override
    public void cerrar() {
        dispose();
    }

    @Override
    public void mostrarPantalla(Usuario usuario) {
        new UIMenuAdministrador(null, false, (UsuarioAdministrador) usuario).setVisible(true);
    }

}
