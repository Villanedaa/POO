/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.exceptions;

/**
 *
 * @author Sebastian
 */
public class operacionInvalidaException extends Exception{
    /**
     * 
     * @param mensaje : contiene el mensaje de error
     */
    public operacionInvalidaException(String mensaje){
        super(mensaje);
    
    }
}
