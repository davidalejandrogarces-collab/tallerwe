/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package univalle.edu.co.web;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import univalle.edu.co.fpoe.modelo.Docente;

/**
 *
 * @author theyu
 */

@Named(value = "controlDoc")
@SessionScoped
public class ControladorDocentes implements Serializable{
    
    private Docente docente= new Docente("fisico",(double)123413,"Juan","Perez");

    public ControladorDocentes() {
        
    }

    public Docente getDocente() {
        return docente;
    }
    
    
    
}
