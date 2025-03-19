/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cajero.autenticacion;

import cajero.Cliente;

/**
 *
 * @author Sebastian
 */
public interface AutenticacionExtra {
    
    /**
     *
     */
   
    boolean autenticar(Cliente cliente,String pin,String res,String nombre);
    
}
