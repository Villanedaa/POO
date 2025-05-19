/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import cliente.Cliente;
import exceptions.usuarioIncorrectoException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @since 19/05/2025
 * @version 1.0
 * 
 */
public class ClienteTest {
    Cliente cliente = new Cliente("sebas",123 + "");
    @Test 
    public void getNombreTest(){
        cliente.setNombre("se");
        assertEquals("se",cliente.getNombre());
    }
    @Test
    public void getPinTest(){
        cliente.setPin(12345+"");
        assertEquals("12345",cliente.getPin());
    }
    
}
