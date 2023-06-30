/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import exceptions.PeajesException;
import observer.Observable;
import observer.Observer;
import java.util.List;
import modelo.Bonificable;
import modelo.Bonificacion;
import modelo.Puesto;
import modelo.UsuarioPropietario;
import modelo.fachada.Fachada;
import vista.AsignarBonificacionesVista;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian 
 */
public class AsignarBonificacionesControlador implements Observer {

    private Fachada fachada = Fachada.getInstancia();
    private UsuarioPropietario usuarioEncontrado;
    private AsignarBonificacionesVista vista;

    public AsignarBonificacionesControlador(AsignarBonificacionesVista vista) {
        this.vista = vista;
        fachada.subscribir(this);
    }

    public void inicializar() {
        vista.cargarBonificaciones(fachada.getTiposBonificacion());
        vista.cargarPuestos(fachada.getPuestos());
    }

    public void buscarPropietario(String cedula) {
        try {
            this.usuarioEncontrado = fachada.buscarPropietario(cedula);
            mostrarDatosUsuarios();
        } catch (PeajesException pe) {
            vista.mostrarMensaje(pe.getMessage());
        } catch (NumberFormatException nfe) {
            vista.mostrarMensaje("Ingrese un formato válido de cédula");
        }
    }

    public void asignarBonificacion(Bonificable tipoBonificacion, Puesto puesto) {
        Bonificacion bonificacionAAsignar = new Bonificacion(tipoBonificacion, puesto);
        try {
            fachada.asignarBonificacion(this.usuarioEncontrado, bonificacionAAsignar);
        } catch (PeajesException pe) {
            vista.mostrarMensaje(pe.getMessage());
        }
    }

    private void mostrarDatosUsuarios() {
        vista.mostrarNombrePropietario(this.usuarioEncontrado.getNombre());
        vista.cargarListaBonificaciones(this.usuarioEncontrado.getBonificaciones());
    }

    public void cerrar() {
        fachada.desubscribir(this);
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        Observable.Evento e = (Observable.Evento) evento;
        if (e.equals(Observable.Evento.BONIFICACION_ASIGNADA)) {
            mostrarDatosUsuarios();
        }
    }

}
