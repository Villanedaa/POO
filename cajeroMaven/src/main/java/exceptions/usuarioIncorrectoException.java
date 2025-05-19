/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 *  
 * @author sebastian villaneda gutierrez<sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since  05/10/2025
 * 
 */
public class usuarioIncorrectoException extends Exception {
   /**
    * 
    * @param mensaje : Contiene el mensaje de error
    */ 

    public usuarioIncorrectoException(String message) {
        super(message);
    }
    
}
