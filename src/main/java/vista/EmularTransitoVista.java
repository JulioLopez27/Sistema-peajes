package vista;

import java.util.List;
import modelo.Puesto;
import modelo.Tarifa;
import modelo.Transito;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian 
 */
public interface EmularTransitoVista {

    public void cargarComboPuestos(List<Puesto> puestos);

    public void mostrarDatosDeTransito(String detallesTransito);

    public void mostrarMensaje(String mensaje);

    public void mostrarTarifasDePuesto(List<Tarifa> tarifas);

}
