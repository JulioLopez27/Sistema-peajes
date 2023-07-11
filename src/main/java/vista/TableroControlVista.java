/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vista;

import java.util.List;
import modelo.Bonificacion;
import modelo.Notificacion;
import modelo.Recarga;
import modelo.Transito;
import modelo.UsuarioPropietario;
import modelo.Vehiculo;


public interface TableroControlVista {

    public void inicializarDatos(UsuarioPropietario usuarioPropietario);

    public void cargarListaDeVehiculos(List<Vehiculo> vehiculos);

    public void cargarListaDeBonificaciones(List<Bonificacion> bonificaciones);

    public void cargarListaDeTransitos(List<Transito> transitos);

    public void cargarListaDeRecargas(List<Recarga> recargas);

    public void cargarListaDeNotificaciones(List<Notificacion> notificaciones);

    public void ejecutarRecargaSaldo(UsuarioPropietario usuarioPropietario);

    public void actualizarSaldo(String saldo);

    public void actualizarCantBonificaciones(String cantBonificaciones);

    public void actualizarCantTransitos(String cantTransitos);

    public void actualizarCantRecargas(String cantRecargas);

    public void actualizarCantNotificaciones(String cantNotificaciones);
}
