/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.fpoe.modelo;

/**
 *
 * @author Sala Sistemas
 */
public class Estudiante extends Persona {

    private double codigo;
    private Programa programa;
    

    public Estudiante(double codigo, Programa programa, double nuip, String nombres, String apellidos) {
        super(nuip, nombres, apellidos);
        this.codigo = codigo;
        this.programa = programa;
    }

    public double getCodigo() {
        return codigo;
    }

    public Programa getPrograma() {
        return programa;
    }

}