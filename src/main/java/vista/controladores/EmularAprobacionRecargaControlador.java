/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import observer.Observable;
import observer.Observer;
import modelo.Recarga;
import modelo.UsuarioAdministrador;
import modelo.fachada.Fachada;
import vista.EmularAprobacionRecargaVista;


public class EmularAprobacionRecargaControlador implements Observer {

    private EmularAprobacionRecargaVista vista;
    private UsuarioAdministrador usuarioAdministrador;
    private Fachada fachada = Fachada.getInstancia();

    public EmularAprobacionRecargaControlador(EmularAprobacionRecargaVista vista, UsuarioAdministrador usuarioAdministrador) {
        this.vista = vista;
        this.usuarioAdministrador = usuarioAdministrador;
        fachada.subscribir(this);
        vista.mostrarListaRecargas(fachada.getRecargasPendientes());
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        Observable.Evento e = (Observable.Evento) evento;
        switch (e) {
            case RECARGA_SOLICITADA, RECARGA_APROBADA ->
                vista.mostrarListaRecargas(fachada.getRecargasPendientes());
        }
    }

    public void aprobarRecarga(Recarga recarga) {
        if (fachada.aprobar(recarga, usuarioAdministrador)) {
            vista.mostrarMensaje("La recarga se aprobó correctamente.");
        } else {
            vista.mostrarMensaje("Ocurrió un error y no se pudo aprobar.");
        }
    }

    public void cerrar() {
        Fachada.getInstancia().desubscribir(this);
    }
}
