/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.servicios;

import modelo.Bonificable;
import modelo.Puesto;
import modelo.Tarifa;
import java.util.ArrayList;
import java.util.List;


public class ServicioPeajes {

    private List<Puesto> puestos = new ArrayList();
    private List<Bonificable> tiposBonificacion = new ArrayList();

    public ServicioPeajes() {

    }

    public List<Puesto> getPuestos() {
        return puestos;
    }

    public List<Bonificable> getTiposBonificacion() {
        return tiposBonificacion;
    }

    public void agregar(Puesto puesto) {
        this.puestos.add(puesto);
    }

    public void agregar(Bonificable tipoBonificacion) {
        this.tiposBonificacion.add(tipoBonificacion);
    }

    public void agregar(Tarifa tarifa, Puesto puesto) {
        for (Puesto p : puestos) {
            if (p.equals(puesto)) {
                p.agregar(tarifa);
            }
        }
    }

}
