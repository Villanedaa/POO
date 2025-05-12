/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 05/12/2025
 * 
 */

/**
 * 
 * RETO:
 * Simula un sistema donde un cliente realiza una compra
 * y el pago se procesa de forma asíncrona (en segundo plano). 
 * Mientras el pago se procesa, el sistema puede continuar haciendo otras tareas, 
 * como mostrar mensajes o permitir nuevas compras.
 */
public class PagoInvalidoException extends Exception{
    

    public PagoInvalidoException(String message) {
        super(message);
    }
    
    
}
