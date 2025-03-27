/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.pagos;

import cajero.Cajero;
import cajero.Cliente;
import cajero.autenticacion.AutenticacionExtra;
import cajero.exceptions.operacionInvalidaException;
import cajero.exceptions.saldoInsuficienteException;

/**
 *
 * @author Sebastian <sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 19032025
 * 
 */


public class PagoTarjetaa extends Pago{
    
    public PagoTarjetaa(){
     
        
    
    }
    
    /**
     * 
    * @param monto : variable que guardara el monto a pagar
     * @return : se retorna un mensaje con el resultado de la operacion
     
     */
    @Override
    public String pagar(float monto) throws operacionInvalidaException, saldoInsuficienteException {
        return super.pagar(monto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


   
   

}


    
    

