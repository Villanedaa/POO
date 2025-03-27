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
 * se crea la clase PagoPaypal la cual hereda de Pago y implementa la autenticacion
 */
public class PagoPaypal extends Pago implements AutenticacionExtra{

    /**
     * 
     * @param cliente : Variable que guarda un Cliente de tipo Cliente 
     * @param nombre : variable que guarda el nombre de un cliente para la autenticacion
     * @param pin : variable que guardara el pin de una cuenta para la autenticacion
     * @param res : Variable que guardara 
     * @return : retorna un booleano con el resultado de la autenticacion
     */
    public boolean autenticar(Cliente cliente, String nombre,String pin,String res) {
      
         boolean resultado = false;
        
        if ((cliente.getPin() == null ? pin == null : cliente.getPin().equals(pin)) && res.equalsIgnoreCase("no")&& cliente.getNombre().equalsIgnoreCase(nombre) ) {
            
              /*
            
            se recibe un cliente, nombre, pin, y una respuesta como paremetro. Las cuales seran
            comparadas con la informacion que posea el usuario.
            
            Si esta comparacion resulta correcta, Se retornara un True.
            El cual sera mostrado en un campo texto 
            
            */
            resultado = true;
       
        }
        
        return resultado;
    }
    
  

    
   
    
}
