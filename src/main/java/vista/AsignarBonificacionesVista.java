/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

import java.util.List;
import modelo.Bonificable;
import modelo.Bonificacion;
import modelo.Puesto;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian 
 */
public interface AsignarBonificacionesVista {

    public void cargarBonificaciones(List<Bonificable> tiposBonificacion);

    public void cargarPuestos(List<Puesto> puestos);

    public void cargarListaBonificaciones(List<Bonificacion> bonificacionesUsuario);

    public void mostrarNombrePropietario(String nombre);

    public void mostrarMensaje(String mensaje);
}
