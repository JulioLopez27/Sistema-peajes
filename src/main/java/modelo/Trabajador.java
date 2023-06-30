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
public class Trabajador implements Bonificable, Renderizable {

    public Trabajador() {

    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        int dayOfWeek = transito.getFecha().getDayOfWeek().getValue();
        return (dayOfWeek >= 1 && dayOfWeek <= 5) ? 80 : 0;
    }

    @Override
    public String getNombre() {
        return "Trabajador";
    }

    @Override
    public String getDescription() {
        return this.getNombre();
    }

}
