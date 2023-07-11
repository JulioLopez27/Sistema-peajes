/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import exceptions.LoginException;
import modelo.Usuario;
import vista.LoginAbstractoVista;


public abstract class LoginAbstractoControlador {

    protected LoginAbstractoVista vista;

    public LoginAbstractoControlador(LoginAbstractoVista vista, String titulo) {
        this.vista = vista;
        vista.mostrarTitulo(titulo);
    }

    public void login(String cedula, String password) {
        try {
            int cedulaNro = Integer.parseInt(cedula);
            Usuario usuario = this.validarUsuario(cedulaNro, password);
            this.ejecutarProximoCasoDeUso(usuario);
            vista.cerrar();
        } catch (LoginException e) {
            vista.mostrarMensaje(e.getMessage());
        } catch (NumberFormatException nfe) {
            vista.mostrarMensaje("La cédula debe ser numérica.");
        }
    }

    protected abstract Usuario validarUsuario(int cedula, String password) throws LoginException;

    protected void ejecutarProximoCasoDeUso(Usuario usuario) {
        this.vista.mostrarPantalla(usuario);
    }
}
