/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian 
 */
public class Transito {

    private Vehiculo vehiculo;
    private Puesto puesto;
    private LocalDateTime fecha;
    private double montoPagado;
    private Bonificacion bonificacion = null;

    public Transito(Vehiculo vehiculo, Puesto puesto) {
        this.vehiculo = vehiculo;
        this.puesto = puesto;
        this.fecha = LocalDateTime.now();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    /*
    * Este método es únicamente usado para datos de prueba
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return this.getFecha().format(formato);
    }

    public double getMonto() {
        return this.puesto.getMonto(this.vehiculo.getCategoria());
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return this.vehiculo.getUsuarioPropietario();
    }

    public double getPorcentajeDescuento() {
        return (this.bonificacion != null) ? this.bonificacion.getPorcentajeDescuento(this) : 0;
    }

    public double getMontoAPagar() {
        double montoTransito = this.getMonto();
        double porcentajeDescuento = this.getPorcentajeDescuento() / 100;
        double resultado = montoTransito - (montoTransito * porcentajeDescuento);
        return Math.round(resultado);
    }

}
