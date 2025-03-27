/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.pagos;

import cajero.Cajero;

import cajero.exceptions.operacionInvalidaException;
import cajero.exceptions.saldoInsuficienteException;

/**
 *
 * @author Sebastian <sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 19032025
 * 
 */

/**
 * 
 * Se crea una clase abstracta Pago con el fin de que multiples hijos puedan heredar de ella para implementar diversas funciones
 */
abstract class Pago {
    /**
     * 
     * 
     * @param monto : variable que guarda el monto de x cuenta de x usuario
     * @return: se retorna el monto que tiene el usuario en su cuenta 
     * @throws operacionInvalidaException
     * @throws saldoInsuficienteException 
     */
    String pagar(float monto) throws operacionInvalidaException, saldoInsuficienteException{
    
    String mensaje = "";
    if (monto <= 0) { 
              throw new operacionInvalidaException("Deposito invalido");
        }
        
        else 
    {
           mensaje+= "pago valido";
    }
        return mensaje; 
    }
}
