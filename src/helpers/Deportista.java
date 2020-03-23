/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Donatilo Castillo
 */
public class Deportista extends Persona {
    
    public Deportista(){
        
        establecerNombre("Ethan A. Castillo");
        establecerProfesion("Deportista");
    
    }

    @Override
    public String getUniversidad() {
        return "UTH";
    }

    @Override
    public String getEspecialidad() {
        return "Futbolista";
    }
    
}
