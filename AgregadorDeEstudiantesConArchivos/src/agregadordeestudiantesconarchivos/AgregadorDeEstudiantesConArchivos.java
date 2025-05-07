/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregadordeestudiantesconarchivos;

/**
 *
 *  * @version 1.0
 * @author sebastian villaneda gutierrez
 * sebastian.villanedag@autonoma.edu.co
 */

/**
 * Clase donde tendremos nuestro writer encargado de escribir a los estudiantes 
 * en el archivo
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AgregadorDeEstudiantesConArchivos {
    /**
     * Se crea un arreglo dinamico de estudiantes
     */
    
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    
    /**
     * 
     * @param nombre  : Parametro que recibe el nombre del estudiante
     * @param nota  : Parametro que recibe la nota del estudiante
     */
    public void agregarEstudiante(String nombre,float nota){
    
        Estudiante estudiante = new Estudiante(nombre,nota);
        estudiantes.add(estudiante);
    
    }
    
    /**
     * Metodo que generara nuestro archivo.cav
     */
    public void generarArchivo(){
            String archivoCSV =  "persona.csv";
          
           try(FileWriter escritor = new FileWriter(archivoCSV)){
               escritor.append("NOMBRE|NOTA \n");
               
               for(Estudiante estudiante : estudiantes){
                   
                   escritor.append(estudiante.mostrarInfo()).append("\n");
               }
               } catch(IOException e){
                   System.out.println(e.getMessage());
               }
    }  
}
