/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.exceptions;

/**
 * * @version 1.0
 * @author sebastian villaneda gutierrez
 * sebastian.villanedag@autonoma.edu.co
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
