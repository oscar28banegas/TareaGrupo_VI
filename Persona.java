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
public abstract class Persona {
    //Atributos
  private String nombre;
  private String profesion;
  
  public Persona(){
    //Constructor sin parametros
  }
  
  //Declaracion de metodos abstractos
  abstract String getUniversidad();
  abstract String getEspecialidad();
  
  //Establecer y obtener
  public void establecerNombre (String nombre){
    this.nombre = nombre;
  }
  
  public String obtenerNombre(){
    return this.nombre;
  }
  
  //Establecer y obtener
  public void establecerProfesion (String profesion){
    this.profesion = profesion;
  }
  
  public String obtenerMedida(){
    return this.profesion;
  }
  
  public void imprimirInformacion(){
    System.out.println("Nombre: " + nombre + " ");
    System.out.println("Profesión: " + profesion + " " );
  }
}
