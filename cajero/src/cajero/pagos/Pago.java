/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.pagos;

import cajero.Cajero;
import cajero.Cliente;
import cajero.exceptions.operacionInvalidaException;
import cajero.exceptions.saldoInsuficienteException;

/**
 *
 * @author Sebastian
 */
abstract class Pago {
    
    float pagar(Cajero cajero,float monto) throws operacionInvalidaException, saldoInsuficienteException{
    
    
    if (monto <= 0) { 
            throw new operacionInvalidaException("Deposito invalido");
        }
        
        else 
    {
           cajero.retirar(monto);
    }
        return monto; 
    }
}
