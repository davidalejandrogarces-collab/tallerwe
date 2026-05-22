/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.fpoe.modelo;

/**
 *
 * @author Sala Sistemas
 */
public class Docente extends Persona {

    private String profesion;
   

    public Docente(String profesion, double nuip, String nombres, String apellidos) {
        super(nuip, nombres, apellidos);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

}