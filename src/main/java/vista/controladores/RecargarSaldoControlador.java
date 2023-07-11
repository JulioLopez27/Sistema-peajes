/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import exceptions.PeajesException;
import observer.Observable;
import observer.Observer;
import static java.lang.Double.parseDouble;
import modelo.Recarga;
import modelo.UsuarioPropietario;
import modelo.fachada.Fachada;
import vista.RecargaSaldoVista;


public class RecargarSaldoControlador implements Observer {

    private UsuarioPropietario usuario;
    private RecargaSaldoVista vista;
    private Fachada fachada = Fachada.getInstancia();

    public RecargarSaldoControlador(RecargaSaldoVista vista, UsuarioPropietario usuarioPropietario) {
        fachada.subscribir(this);
        this.usuario = usuarioPropietario;
        this.vista = vista;
    }

    public void aceptarRecarga(String montoARecargar) {
        try {
            Recarga nuevaRecarga = new Recarga(parseDouble(montoARecargar), this.usuario.getCuenta());
            fachada.agregar(nuevaRecarga);
        } catch (PeajesException e) {
            vista.mostrarMensaje(e.getMessage());
        } catch (NumberFormatException nfe) {
            vista.mostrarMensaje("Monto inválido");
        }
    }

    public void mostrarInformacionDelUsuario() {
        mostrarNombreUsuario();
        mostrarSaldoDelUsuario();
    }

    private void mostrarNombreUsuario() {
        vista.mostrarNombreUsuario(usuario.getNombre());
    }

    private void mostrarSaldoDelUsuario() {
        vista.mostrarSaldoDelUsuario(usuario.getCuenta().getSaldoFormateado());
    }

    public void cerrar() {
        fachada.desubscribir(this);
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        Observable.Evento e = (Observable.Evento) evento;
        if (e.equals(Observable.Evento.RECARGA_APROBADA)) {
            this.mostrarSaldoDelUsuario();
        }
    }

}
