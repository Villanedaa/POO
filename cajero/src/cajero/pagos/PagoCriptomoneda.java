/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.pagos;

import cajero.Cliente;
import cajero.autenticacion.AutenticacionExtra;

/**
 *
 * @author Sebastian <sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 19032025
 * 
 */

/**
 * 
 * Se crea la clase PagoCriptomoneda, La cual hereda de la clase Pago y implementa el metodo Autenticar de la interface AutenticacionExtra
 */
public class PagoCriptomoneda extends Pago implements AutenticacionExtra {

    @Override
    
    public boolean autenticar(Cliente cliente, String nombre,String pin,String res) {
      
         boolean resultado = false;
        
        if ((cliente.getPin() == null ? pin == null : cliente.getPin().equals(pin)) && res.equalsIgnoreCase("no")&& cliente.getNombre().equalsIgnoreCase(nombre) ) {
            resultado = true;
         
        }
        
        return resultado;
        
         
    }
    
}
