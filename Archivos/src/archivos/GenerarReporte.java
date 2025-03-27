/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import archivos.Persona;

/**
 *
 * @author Sebastian
 */
public class GenerarReporte {
    
    
    
    
    public static void main(String[] args) throws IOException {
           String archivoCSV =  "persona.csv";
           List<Persona> personas = Arrays.asList(new Persona(1,"sebas",2),new Persona(1,"albeiro",2));
           try(FileWriter escritor = new FileWriter(archivoCSV)){
               escritor.append("EDAD|NOMBRE|ID \n");
               
               for(Persona persona : personas){
                   
                   escritor.append(persona.getValorCSV()).append("\n");
               }
               System.out.println("Se guardo el archivo");
                   
               
               } catch(IOException e){
                   System.out.println(e.getMessage());
               }
               
               
            
           
           
    }
}
    
