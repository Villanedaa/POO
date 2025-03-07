/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author Sebastian
 * @version 1.0
 */
public class Cliente {
    
    private String nombre; //se define la variable nombre
    private String pin ;  // se define el pin que tendra el usuario para acceder al cajero
            /**
             * Se crea el metodo constructor del Cliente
             * @param nombre
             * @param pin 
             */
    public Cliente(String nombre, String pin){
        this.nombre = nombre;
        this.pin = pin;
    
    }
   
    /**
     * se retorna el nombre del cliente
     * @return 
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * se otroga valor al nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * se obtiene el pin del cliente
     * @return 
     */
    public String getPin() {
        return pin;
    }
/**
 * se le otorga un valor al pin
 * @param pin 
 */
    public void setPin(String pin) {
        this.pin = pin;
    }
   
    
}
