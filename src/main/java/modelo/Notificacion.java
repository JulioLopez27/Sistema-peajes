/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public class Notificacion {

    private LocalDateTime fecha;
    private String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
        this.fecha = LocalDateTime.now();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFechaFormateada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return this.getFecha().format(formato);
    }

}
