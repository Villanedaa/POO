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
 * @author Sebastian
 */ 

class PagoPaypal extends Pago implements AutenticacionExtra{

    public boolean autenticar(Cliente cliente, String nombre,String pin,String res) {
      
         boolean resultado = false;
        
        if ((cliente.getPin() == null ? pin == null : cliente.getPin().equals(pin)) && res.equalsIgnoreCase("no")&& cliente.getNombre().equalsIgnoreCase(nombre) ) {
            resultado = true;
         
        }
        
        return resultado;
    }
    
    float pagar(Cajero cajero,float monto) throws operacionInvalidaException, saldoInsuficienteException{
    
       
        
        return cajero.getSaldo();
    }

    
   
    
}
