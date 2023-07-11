/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Usuario;
import modelo.UsuarioPropietario;
import java.awt.Frame;
import vista.controladores.LoginUsuarioPropietarioControlador;


public class LoginUsuarioPropietario extends LoginAbstracto {

    public LoginUsuarioPropietario(Frame parent, boolean modal) {
        super(parent, modal);
        super.setControlador(new LoginUsuarioPropietarioControlador(this, "Aplicación para propietarios"));
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
        new UITableroDeControl((UsuarioPropietario) usuario).setVisible(true);
    }

}
