/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

import java.util.List;
import modelo.Recarga;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public interface EmularAprobacionRecargaVista {

    public void mostrarListaRecargas(List<Recarga> recargasPendientes);

    public void mostrarMensaje(String mensaje);
}
