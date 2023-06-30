/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

import modelo.Usuario;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public interface LoginAbstractoVista {

    public void mostrarTitulo(String titulo);

    public void mostrarMensaje(String mensaje);

    public void mostrarPantalla(Usuario usuario);

    public void cerrar();
}
