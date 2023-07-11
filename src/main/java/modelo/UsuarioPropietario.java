/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import exceptions.PeajesException;
import observer.Observable;
import java.util.ArrayList;
import java.util.List;
import modelo.fachada.Fachada;


public class UsuarioPropietario extends Usuario {

    private double saldoMinimoAlerta;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private Cuenta cuenta;
    private List<Notificacion> notificaciones = new ArrayList<>();
    private List<Bonificacion> bonificaciones = new ArrayList<>();

    public UsuarioPropietario(double saldoMinimoAlerta, Cuenta cuenta, int cedula, String password, String nombre) {
        super(cedula, password, nombre);
        this.saldoMinimoAlerta = saldoMinimoAlerta;
        this.cuenta = cuenta;
    }

    public void agregar(Bonificacion bonificacion) {
        this.bonificaciones.add(bonificacion);
    }

    public double getSaldoMinimoAlerta() {
        return saldoMinimoAlerta;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    //Este método es únicamente usado para datos de prueba
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public int getCantidadTransitos() {
        int cantidadTransitos = 0;
        for (Vehiculo v : this.getVehiculos()) {
            cantidadTransitos += v.getCantidadTransitos();
        }
        return cantidadTransitos;
    }

    public void agregarRecarga(Recarga recarga) throws PeajesException {
        this.cuenta.agregar(recarga);
    }

    public List<Recarga> getRecargasPendientes() {
        return this.cuenta.getRecargasPendientes();
    }

    public List<Recarga> getRecargas() {
        return this.cuenta.getRecargas();
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        return this.getCuenta().aprobar(recarga, usuarioAdministrador);
    }

    public boolean existe(Vehiculo vehiculo) {
        for (Vehiculo v : this.vehiculos) {
            if (v.equals(vehiculo)) {
                return true;
            }
        }
        return false;
    }

    public Transito agregar(Transito transito) throws PeajesException {
        Bonificacion bonificacionPuesto = this.getBonificacionPuesto(transito.getPuesto());
        transito.setBonificacion(bonificacionPuesto);
        double montoAPagar = transito.getMontoAPagar();
        if (this.getCuenta().validarSaldo(montoAPagar)) {
            for (Vehiculo vehiculo : vehiculos) {
                transito.setMontoPagado(montoAPagar);
                if (vehiculo.equals(transito.getVehiculo()) && vehiculo.agregar(transito)) {
                    this.getCuenta().pagarTransito(montoAPagar);
                    return transito;
                }
            }
        } else {
            throw new PeajesException("Saldo insuficiente: " + this.cuenta.getSaldoFormateado());
        }
        throw new PeajesException("No se pudo registrar el tránsito");
    }

    public List<Transito> getTransitos() {
        List<Transito> transitosUsuario = new ArrayList();
        for (Vehiculo v : vehiculos) {
            transitosUsuario.addAll(v.getTransitos());
        }
        return transitosUsuario;
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().toLowerCase().equals(matricula.toLowerCase())) {
                return vehiculo;
            }
        }
        return null;
    }

    public void asignarBonificacion(Bonificacion bonificacionSeleccionada) throws PeajesException {
        if (bonificaciones.isEmpty() || !existeBonificacion(bonificacionSeleccionada)) {
            this.bonificaciones.add(bonificacionSeleccionada);
            Fachada.getInstancia().notificar(Observable.Evento.BONIFICACION_ASIGNADA);
        } else {
            throw new PeajesException("Ya tiene una bonificacion asignada para este puesto");
        }
    }

    private boolean existeBonificacion(Bonificacion bonificacionSeleccionada) {
        for (Bonificacion b : bonificaciones) {
            if (b.getPuesto().equals(bonificacionSeleccionada.getPuesto())) {
                return true;
            }
        }
        return false;
    }

    public Bonificacion getBonificacionPuesto(Puesto puestoSeleccionado) {
        for (Bonificacion b : bonificaciones) {
            if (b.getPuesto().equals(puestoSeleccionado)) {
                return b;
            }
        }
        return null;
    }

    public void agregar(Notificacion notificacion) {
        this.notificaciones.add(notificacion);
        Fachada.getInstancia().notificar(Observable.Evento.NOTIFICACIONES_ACTUALIZADAS);
    }

    public void borrarNotificaciones() {
        this.notificaciones.clear();
        Fachada.getInstancia().notificar(Observable.Evento.NOTIFICACIONES_ACTUALIZADAS);
    }

}
