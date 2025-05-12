/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import clases.Producto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @version 1.0
 * @since 05/12/2025
 * 
 */

/**
 * 
 * RETO:
 * Simula un sistema donde un cliente realiza una compra
 * y el pago se procesa de forma asíncrona (en segundo plano). 
 * Mientras el pago se procesa, el sistema puede continuar haciendo otras tareas, 
 * como mostrar mensajes o permitir nuevas compras.
 */
public class HiloProcesarPago extends Thread {
    
    
    private boolean procesando = false;
    private int numero;
    private Producto producto;
    private JFrame frame;  // Nuevo campo para almacenar la referencia al frame

    public HiloProcesarPago(Producto producto, JFrame frame) {
        this.producto = producto;
        this.frame = frame;
    }
    
    @Override
    public void run() {
        procesando = true;
        try {
            int tiempo = (int) (Math.random() * 3000 + 4000); // 4-7 seg
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            // 
        }
        producto.setEstado("PAGADO");
        procesando = false;
        
        // Mostrar el mensaje cuando termine el procesamiento
        //que es: Cuando quieres actualizar la interfaz gráfica 
        //desde otro hilo (por ejemplo, después de una operación en segundo plano).
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(frame, "El pago ha sido procesado exitosamente");
        });
    }
    
    
    
    public boolean procesar(boolean procesando){
        return procesando;
    }

    public boolean isProcesando() {
        return procesando;
    }

    public void setProcesando(boolean procesando) {
        this.procesando = procesando;
    }
    
    
    
    
}
