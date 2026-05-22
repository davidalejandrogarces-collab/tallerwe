/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.fpoe.modelo;

/**
 *
 * @author Sala Sistemas
 */
public class Programa {

    private double codigo;
    private String nombre;

    public Programa(double codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

}