package vista.controladores;

import exceptions.PeajesException;
import observer.Observable;
import observer.Observer;
import modelo.Puesto;
import modelo.Transito;
import modelo.Vehiculo;
import modelo.fachada.Fachada;
import vista.EmularTransitoVista;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian 
 */
public class EmularTransitoControlador {

    private EmularTransitoVista vista;

    public EmularTransitoControlador(EmularTransitoVista vista) {
        this.vista = vista;

    }

    public void cargarComboPuestos() {
        vista.cargarComboPuestos(Fachada.getInstancia().getPuestos());
    }

    public void cargarTarifasDePuesto(Puesto puesto) {
        vista.mostrarTarifasDePuesto(puesto.getTarifas());
    }

    public void registrarTransito(Puesto puestoSeleccionado, String matricula) {
        try {
            Vehiculo vehiculoEncontrado = Fachada.getInstancia().buscarVehiculo(matricula);
            Transito transitoAgregado = Fachada.getInstancia().agregar(new Transito(vehiculoEncontrado, puestoSeleccionado));
            vista.mostrarDatosDeTransito(detallesDeTransito(transitoAgregado));
        } catch (PeajesException pe) {
            vista.mostrarMensaje(pe.getMessage());
        }
    }

    private String detallesDeTransito(Transito transitoAgregado) {
        String nombreBonificacion = (transitoAgregado.getBonificacion() != null) ? transitoAgregado.getBonificacion().getNombre() : "No tiene";
        String datosTransito = "Nombre de Propietario: " + transitoAgregado.getUsuarioPropietario().getNombre() + "\r\n"
                + "Categoría de vehículo: " + transitoAgregado.getVehiculo().getCategoria().getNombre() + "\r\n"
                + "Bonificación: " + nombreBonificacion + "\r\n"
                + "Costo del tránsito: " + transitoAgregado.getMontoPagado() + "\r\n"
                + "Saldo disponible: " + transitoAgregado.getUsuarioPropietario().getCuenta().getSaldo();
        return datosTransito;
    }

}
