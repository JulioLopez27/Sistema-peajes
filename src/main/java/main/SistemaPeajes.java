/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import vista.InicioAplicacion;


public class SistemaPeajes {

    public static void main(String[] args) {
        DatosPrueba.cargar();
        InicioAplicacion sistema = new InicioAplicacion();
        sistema.setVisible(true);
    }
}
