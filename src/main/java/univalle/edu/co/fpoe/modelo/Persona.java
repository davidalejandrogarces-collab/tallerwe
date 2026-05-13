/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.fpoe.modelo;

/**
 *
 * @author Sala Sistemas
 */
public class Persona {

    private double nuip;
    private String nombres;
    private String apellidos;

    public Persona(double nuip, String nombres, String apellidos) {
        this.nuip = nuip;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public double getNuip() {
        return nuip;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

}
