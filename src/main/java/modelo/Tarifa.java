/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public class Tarifa {

    private double monto;
    private Categoria categoria;

    public Tarifa(double monto, Categoria categoria) {
        this.monto = monto;
        this.categoria = categoria;
    }

    public double getMonto() {
        return monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
