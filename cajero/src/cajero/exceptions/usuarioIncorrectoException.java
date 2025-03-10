/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.exceptions;

/**
 *
 * @author Sebastian
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
