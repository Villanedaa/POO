/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase para testear los metodos del cliente
 */
/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 19/05/2025
 */



import cajero.Cajero;
import cliente.Cliente;
import exceptions.operacionInvalidaException;
import exceptions.saldoInsuficienteException;
import exceptions.usuarioIncorrectoException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CajeroTest {
    private Cajero cajero = new Cajero(1000);
    private Cliente cliente = new Cliente("alvaro",123 +"");
    /**
     * test para comprobar el getter del saldo
     */
    @Test
   public void getSaldo() {
        float resultado = cajero.getSaldo();
        assertEquals(1000, resultado);
    }
   /**
    * Test para verificar el correcto funcionamiento del setter del saldo de la clase cajero
    */
    
   @Test
   public void setSaldo(){
       cajero.setSaldo(1000);
       float resultado = 1000;
               //valor esperado, valor que se esta devolviendo, delta : margen de error
       assertEquals(resultado,cajero.getSaldo(),0.0001);
   }
   /**
    * Test sobre el metodo retirar de cajero
    * @throws saldoInsuficienteException: excepcion en caso de retirar un monto mayor al monto actual
    * @throws operacionInvalidaException : excepcion en caso de retirar dinero negativo o inexistente
    */
   @Test
   
    public void retirarTest() throws saldoInsuficienteException, operacionInvalidaException {
    
    
      //test para comprobar que la excepcion de saldi insuficiente se lanze conrrectamente
    assertThrows(saldoInsuficienteException.class, () -> {
        cajero.retirar(10000000); 
    });
    /**
     * test para comprobar que la expecion de operacion invalida se lanze correctamente
     */
    assertThrows(operacionInvalidaException.class, () -> {
        cajero.retirar(-10000000); 
    });
    //
    //test para el caso positivo del metodo
    cajero.retirar(1000);
    assertEquals(0,cajero.getSaldo());
    
    }
    
    /**
     * () -> { ... } define una función anónima sin parámetros.
        El bloque { ... } es el código que esperas que lance la excepción.
        JUnit ejecuta ese bloque y comprueba si realmente lanza la excepción MiExcepcion
     */
    @Test
    public void Testdepositar() throws operacionInvalidaException{
    cajero.depositar(1000);
    assertEquals(2000,cajero.getSaldo());
    assertThrows(operacionInvalidaException.class,() ->{
       cajero.depositar(-1000);
    });
    
    }
    @Test
    public void Testingresar() throws usuarioIncorrectoException{
    
        //test funcionamiento caso base
        assertEquals("true",cajero.ingresar(cliente,cliente.getNombre(),cliente.getPin()));
        //nombre correcto y pin incorrecto
        assertThrows(usuarioIncorrectoException.class,()->{
            cajero.ingresar(cliente, "Alvaro", 1234 + "");
        
        });
        //los dos incorrectos
        assertThrows(usuarioIncorrectoException.class, () -> {
        cajero.ingresar(cliente, "fdfdfsdfdsf", "1254543");
    });
        //pin correcto
        assertThrows(usuarioIncorrectoException.class, () -> {
        cajero.ingresar(cliente, "fdfdfsdfdsf", "123");
    });
    
    }
    
}
    
    

