/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import observer.Observable;
import observer.Observer;
import modelo.UsuarioPropietario;
import modelo.fachada.Fachada;
import vista.TableroControlVista;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public class TableroControlControlador implements Observer {

    private Fachada fachada = Fachada.getInstancia();
    private TableroControlVista vista;
    private UsuarioPropietario usuarioPropietario;

    public TableroControlControlador(TableroControlVista vista, UsuarioPropietario usuarioPropietario) {
        this.vista = vista;
        this.usuarioPropietario = usuarioPropietario;
        fachada.subscribir(this);
        vista.inicializarDatos(usuarioPropietario);
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        Observable.Evento e = (Observable.Evento) evento;
        switch (e) {
            case TRANSITO_PAGADO:
                vista.actualizarSaldo(usuarioPropietario.getCuenta().getSaldoFormateado());
                vista.cargarListaDeVehiculos(usuarioPropietario.getVehiculos());
                break;
            case BONIFICACION_ASIGNADA:
                vista.cargarListaDeBonificaciones(usuarioPropietario.getBonificaciones());
                vista.actualizarCantBonificaciones(usuarioPropietario.getBonificaciones().size() + "");
                break;
            case TRANSITO_EFECTUADO:
                vista.cargarListaDeTransitos(usuarioPropietario.getTransitos());
                vista.actualizarCantTransitos(usuarioPropietario.getTransitos().size() + "");
                break;
            case RECARGA_APROBADA:
                vista.cargarListaDeRecargas(usuarioPropietario.getRecargas());
                vista.actualizarSaldo(usuarioPropietario.getCuenta().getSaldoFormateado());
                break;
            case RECARGA_SOLICITADA:
                vista.cargarListaDeRecargas(usuarioPropietario.getRecargas());
                vista.actualizarCantRecargas(usuarioPropietario.getRecargas().size() + "");
                break;
            case NOTIFICACIONES_ACTUALIZADAS:
                vista.cargarListaDeNotificaciones(usuarioPropietario.getNotificaciones());
                vista.actualizarCantNotificaciones(usuarioPropietario.getNotificaciones().size() + "");
                break;

        }
    }

    public void cargarListas() {
        vista.cargarListaDeVehiculos(usuarioPropietario.getVehiculos());
        vista.cargarListaDeBonificaciones(usuarioPropietario.getBonificaciones());
        vista.cargarListaDeTransitos(usuarioPropietario.getTransitos());
        vista.cargarListaDeRecargas(usuarioPropietario.getRecargas());
        vista.cargarListaDeNotificaciones(usuarioPropietario.getNotificaciones());
    }

    public void cerrar() {
        fachada.desubscribir(this);
    }

    public void borrarNotificaciones() {
        usuarioPropietario.borrarNotificaciones();
    }

    public void abrirRecargarSaldo() {
        vista.ejecutarRecargaSaldo(usuarioPropietario);
    }

}
