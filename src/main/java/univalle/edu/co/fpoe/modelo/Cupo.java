/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.fpoe.modelo;

/**
 *
 * @author Sala Sistemas
 */
public class Cupo {

    private Programa programa;
    private short cantidad;
    private short disponibles;

    public Cupo(Programa programa, short cantidad, short disponibles) {
        this.programa = programa;
        this.cantidad = cantidad;
        this.disponibles = disponibles;
    }

    public Programa getPrograma() {
        return programa;
    }

    public short getCantidad() {
        return cantidad;
    }

    public short getDisponibles() {
        return disponibles;
    }

}
