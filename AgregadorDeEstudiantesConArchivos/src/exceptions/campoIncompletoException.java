/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 *  * @version 1.0
 * @author sebastian villaneda gutierrez
 * sebastian.villanedag@autonoma.edu.co
 */

/**
 * Excepcion para cuando todos los campos del formularo no estan completos
 * @author Sebastian
 */
public class campoIncompletoException extends Exception {
    
    /**
     * 
     * @param mensaje : Guarda el mensaje de la excepcion 
     */
    public campoIncompletoException(String mensaje){
    
        super(mensaje );
    }
    
}
