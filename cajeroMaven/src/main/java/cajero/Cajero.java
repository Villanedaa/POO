/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import cliente.Cliente;
import exceptions.operacionInvalidaException;
import exceptions.saldoInsuficienteException;
import exceptions.usuarioIncorrectoException;
import java.util.ArrayList;


/**
 *
 *  
 * @author sebastian villaneda gutierrez<sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since  05/10/2025
 * 
 */

public class Cajero {
    
 
 private float saldo;

    
    
 
 /**
  *  se crea el metodo contructor con el parametro saldo la cual contendra el saldo del cajero
  * @param saldo 
  */
    public Cajero(float saldo){
        this.saldo = saldo;
    
    }
    /**
     * 
     * @return float saldo : retorna el saldo
     */
    public float getSaldo() {
        /**
         * 
         */
        return saldo;
    }
    /**
     * @param cliente
     * @param nombre
     * @param pin
     *
     * @return : se retorna un booleano del resultado
     *  @throws usuarioIncorrectoException 
     */ 
    
    public String ingresar(Cliente cliente, String nombre, String pin) throws usuarioIncorrectoException {
    if (cliente.getNombre().equals(nombre) && cliente.getPin().equals(pin)) {
        return "true";
    } else {
        throw new usuarioIncorrectoException("Ingreso invalido");
    }
}

 /**
     * 
     * @param saldo : se otorga un valor a la variable saldo
     */
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
     /**
      *  metodo que se encarga de hacer depositos de dinero
      * @param deposito : es el monto que se envia por parametro para depositar
      * @return float saldo : retorna el saldo
      * @throws operacionInvalidaException 
      */
    public float depositar(float deposito) throws operacionInvalidaException {
    
        if (deposito <= 0) { 
            throw new operacionInvalidaException("Deposito invalido");
        }
        
        else 
            saldo += deposito;
        return saldo; 

}
     /**
      * metodo que se encarga de hacer retiros de dinero
      * @param retiro : paremetro que se envia para retirar dinero 
      * @return float saldo : retorna el saldo
      * @throws saldoInsuficienteException : en caso de que el saldo sea insufienciente , se muestra esta excepcion
      * @throws operacionInvalidaException : en caso de que el parametro sea invalido, se capta esta excepcion preguntar al profe
      */
    public float retirar(float retiro) throws saldoInsuficienteException, operacionInvalidaException {
            
        
        
           if(retiro > saldo){
            throw new saldoInsuficienteException("Saldo insuficiente");
          }
          
          else if(retiro <= 0){
              
              throw new operacionInvalidaException("retiro invalido");
           
          
          }
         
         else
              saldo-= retiro;
      return saldo;
    
    }
    
}
