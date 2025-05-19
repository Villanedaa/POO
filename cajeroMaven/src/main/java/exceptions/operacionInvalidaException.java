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
public class operacionInvalidaException extends Exception{
    /**
     * 
     * @param mensaje : contiene el mensaje de error
     */
    public operacionInvalidaException(String mensaje){
        super(mensaje);
    
    }
}
