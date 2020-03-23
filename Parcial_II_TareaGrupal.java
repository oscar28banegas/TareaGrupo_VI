/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_ii_tareagrupal;

import helpers.Deportista;
import helpers.Doctor;

/**
 *
 * @author Oscar A. Bueso
 */
public class Parcial_II_TareaGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        Doctor doctor = new Doctor();
        Deportista dep = new Deportista();
        //DoctorAbstraccion da = new DoctorAbstraccion();
        //DeportistaAbstraccion di = new DeportistaAbstraccion();
        
        System.out.println("Profesión N° 1: ");
        doctor.imprimirInformacion();
        System.out.println("Graduado en " + doctor.getUniversidad());
        System.out.println("Especialidad en " + doctor.getEspecialidad());
        
        System.out.println("\nProfesión N° 2: ");
        dep.imprimirInformacion();
        System.out.println("Graduado en " + dep.getUniversidad());
        System.out.println("Especialidad en " + dep.getEspecialidad());
    }
    
}
