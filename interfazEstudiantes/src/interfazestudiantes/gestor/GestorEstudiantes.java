/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazestudiantes.gestor;
import interfazestudiantes.Estudiante;
import java.util.ArrayList;
/**
 *
 * @author Sebastian
 */
public class GestorEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    
    public void agregarEstudiante(String nombre, int edad, float nota){
    
        Estudiante estudiante1 = new Estudiante(nombre,edad,nota);
       estudiantes.add(estudiante1);
    }
    
    
   public String obtenerListaEstudiantes() {
    String lista = "";

    for (Estudiante estudiante : estudiantes) {
        lista += estudiante.getNombre() + ": " + estudiante.getEdad() + "\n";
    }

    return lista;
}
    
    public float calcularPromedioNotas(){
    
     float promedio = 0;
     
      for(Estudiante e : estudiantes){
      
      promedio += e.getNota();
      
      }
     
    return promedio/estudiantes.size();
    }
    
}
