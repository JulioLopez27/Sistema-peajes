/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import exceptions.LoginException;
import modelo.Usuario;
import modelo.fachada.Fachada;
import vista.LoginAbstractoVista;


public class LoginUsuarioAdministradorControlador extends LoginAbstractoControlador {

    public LoginUsuarioAdministradorControlador(LoginAbstractoVista vista, String titulo) {
        super(vista, titulo);
    }

    @Override
    protected Usuario validarUsuario(int cedula, String password) throws LoginException {
        return Fachada.getInstancia().loginUsuarioAdministrador(cedula, password);
    }
}
