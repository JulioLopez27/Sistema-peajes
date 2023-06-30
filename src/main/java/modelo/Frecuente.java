/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.Renderizable;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public class Frecuente implements Bonificable, Renderizable {

    public Frecuente() {

    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        int transitosEnElDia = transito.getVehiculo().getCantidadTransitosHoy(transito.getPuesto());
        return (transitosEnElDia >= 1) ? 50 : 0;
    }

    @Override
    public String getNombre() {
        return "Frecuente";
    }

    @Override
    public String getDescription() {
        return this.getNombre();
    }

}
