/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package univalle.edu.co.fpoe.modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sala Sistemas
 */
public class Curso {

    private short grupo;
    private short totalcupos;
    private Periodo periodo;
    private List<Cupo>cupos = new LinkedList<>();
    private Asignatura asignatura;
    private Docente docente;
    private Horario horario;

}
