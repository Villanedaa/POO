/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacee.autenticacion;

import cliente.Cliente;

/**
 *
 * @author Sebastian <sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 19032025
 * 
 */
/**
 * 
 * se crea una interface para luego implementar el metodo autenticar en dicersas clases
 */
public interface AutenticacionExtra {
    
    /**
     *
     */
   /**
    * Metodo para autenticacion de pagos segun sea el metodo
    * @param cliente : Se manda como parametro una cliente de tipo Cliente
    * @param pin : se recibe un pin para luego compararlo con el pin del cliente
    * @param res : variale que guardara un String para determinar si nuestro usuario es un robot
    * @param nombre : se recibe un nombre para compararlo con el nombre del cliente
    * @return : se retorna un booleano con el resultado de la autenticacion 
    */
    public boolean autenticar(Cliente cliente,String pin,String res,String nombre);
    
}
