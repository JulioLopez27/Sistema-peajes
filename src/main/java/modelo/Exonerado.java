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
public class Exonerado implements Bonificable, Renderizable {

    public Exonerado() {

    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        return 100;
    }

    @Override
    public String getNombre() {
        return "Exonerado";
    }

    @Override
    public String getDescription() {
        return this.getNombre();
    }

}
