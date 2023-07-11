/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Bonificacion {

    private String nombre;
    private Bonificable tipoBonificacion;
    private Puesto puesto;

    public Bonificacion(Bonificable tipoBonificacion, Puesto puesto) {
        this.tipoBonificacion = tipoBonificacion;
        this.nombre = tipoBonificacion.getNombre();
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public Bonificable getTipoBonificacion() {
        return tipoBonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public double getPorcentajeDescuento(Transito transito) {
        return this.tipoBonificacion.getPorcentajeDescuento(transito);
    }

}
