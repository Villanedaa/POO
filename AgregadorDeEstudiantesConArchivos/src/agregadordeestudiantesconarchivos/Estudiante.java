/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregadordeestudiantesconarchivos;

/**
 *
 *  * @version 1.0
 * @author sebastian villaneda gutierrez
 * sebastian.villanedag@autonoma.edu.co
 */

//Clase que define un Estudiante
public class Estudiante {
    /**
     * nombre : Variable que guardara el nombre del estudiante
     * nota: Variable que guarda
     */
    private String nombre;
    private float nota;
    /**
     * 
    * @param nombre: parametro que recibira el nombre del estudiante
     * @param nota: parametro que recibira la nota del estudiante 
     */
    public Estudiante(String nombre,float nota){
        this.nombre = nombre;
        this.nota = nota;
    
    }
    /**
     * 
     * @param nombre  : Le otorga un valor a la variable
     */
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
/**
 * 
 * @param nota : Le otorga un valor a la variable nota
 */
    public void setNota(float nota) {
        this.nota = nota;
    }
    /**
     * 
     * @return : Se retorna el nombre 
     */
    public String getNombre(){
    
        return nombre;
    }
    /**
     * 
     * @return : se retorna la nota
     */
    public float getNota(){
    
        return nota;
    }
    /**
     *  metodo que retorna la informacion del estudiante
     * @return : retorna la informacion del estudiante 
     */
    public String mostrarInfo(){
    
        return this.nombre + "|" + this.nota + "|";
    }
    
}
