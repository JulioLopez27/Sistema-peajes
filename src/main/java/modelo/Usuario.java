/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public abstract class Usuario {

    private int cedula;
    private String password;
    private String nombre;

    public Usuario(int cedula, String password, String nombre) {
        this.cedula = cedula;
        this.password = password;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean validarCredenciales(int cedula, String password) {
        return this.getCedula() == cedula && this.getPassword().equals(password);
    }
}
