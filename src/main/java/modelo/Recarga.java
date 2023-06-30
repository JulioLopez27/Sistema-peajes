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
public class Recarga {

    private double monto;
    private LocalDateTime fecha;
    private UsuarioAdministrador aprobador;
    private Cuenta cuenta;

    public Recarga(double monto, Cuenta cuenta) {
        this.monto = monto;
        this.cuenta = cuenta;
        this.fecha = LocalDateTime.now();
    }

    public double getMonto() {
        return monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getFechaFormateada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return this.getFecha().format(formato);
    }

    public UsuarioAdministrador getAprobador() {
        return aprobador;
    }

    public void setAprobador(UsuarioAdministrador aprobador) {
        this.aprobador = aprobador;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return this.cuenta.getUsuarioPropietario();
    }

    public String getEstado() {
        return (this.aprobador != null) ? "Aprobada" : "Pendiente";
    }

}
