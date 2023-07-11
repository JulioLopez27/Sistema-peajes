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


public class Cuenta {

    private double saldo;
    private UsuarioPropietario usuarioPropietario;
    private List<Recarga> recargas = new ArrayList();

    public Cuenta(double saldo, UsuarioPropietario usuarioPropietario) {
        this.saldo = saldo;
        this.usuarioPropietario = usuarioPropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    //Código para poder aplicar casos de prueba
    public void setUsuarioPropietario(UsuarioPropietario usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public String getSaldoFormateado() {
        return "$ " + this.saldo;
    }

    public void agregar(Recarga recarga) throws PeajesException {
        if (recarga != null && recarga.getMonto() > 0) {
            if (this.recargas.add(recarga)) {
                Fachada.getInstancia().notificar(Observable.Evento.RECARGA_SOLICITADA);
            }
        } else {
            throw new PeajesException("Monto inválido");
        }
    }

    public List<Recarga> getRecargasPendientes() {
        List<Recarga> recargasPendientes = new ArrayList();
        for (Recarga r : this.recargas) {
            if (r.getAprobador() == null) {
                recargasPendientes.add(r);
            }
        }
        return recargasPendientes;
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        for (Recarga r : this.recargas) {
            if (r.equals(recarga)) {
                r.setAprobador(usuarioAdministrador);
                this.saldo += r.getMonto();
                Fachada.getInstancia().notificar(Observable.Evento.RECARGA_APROBADA);
                return true;
            }
        }
        return false;
    }

    public boolean validarSaldo(double montoAPagar) {
        return montoAPagar <= this.getSaldo();
    }

    public void pagarTransito(double montoAPagar) {
        this.saldo -= montoAPagar;
        Fachada.getInstancia().notificar(Observable.Evento.TRANSITO_PAGADO);
        if (this.getSaldo() < this.usuarioPropietario.getSaldoMinimoAlerta()) {
            this.usuarioPropietario.agregar(new Notificacion("Tu saldo actual es de $" + this.getSaldo() + ". Te recomendamos hacer una recarga."));
        }
    }
}
