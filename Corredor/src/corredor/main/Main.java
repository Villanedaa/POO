/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corredor.main;

import corredor.Corredor;

/**
 *
 * @author Sebastian
 */
public class Main {
     public static void main(String[] args) {
        
        Corredor corredor1 = new Corredor("alvaro");
        corredor1.start();
        Corredor corredor2 = new Corredor("sebas");
        Corredor corredor3 = new Corredor("el compa");
        corredor2.start();
        corredor3.start();
        
    }
    
}
