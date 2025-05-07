/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corredor.main;
//se importa la clase corredor
import corredor.Corredor;

/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @since 05/06/2025
 * @version 1.0
 */
public class Main {
     public static void main(String[] args) {
        //Se crean 3 instancias de tipo corredor
        
        Corredor corredor1 = new Corredor("alvaro");
        corredor1.start();
        
        Corredor corredor2 = new Corredor("sebas");
        corredor2.start();
        
        Corredor corredor3 = new Corredor("el compa");
        corredor3.start();
        
    }
    
}
