/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Oscar A. Bueso
 */
public class Doctor extends Persona {
    
    public Doctor(){
        
        establecerNombre("Oscar A. Bueso");
        establecerProfesion("Doctor");
    
    }

    @Override
    public String getUniversidad() {
        return "UTH";
    }

    @Override
    public String getEspecialidad() {
        return "Epidemiologo";
    }
    
}
