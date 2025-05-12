/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import exceptions.PagoInvalidoException;
import hilos.HiloProcesarPago;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
public class Sistema {
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<HiloProcesarPago> pagosEnProceso = new ArrayList<>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    public void crearPago(String nombre,int precio)throws PagoInvalidoException{
        if(precio <= 0){
            throw new PagoInvalidoException("PRECIO INVALIDO");
        
        
        } else {
             Producto producto = new Producto(nombre,precio,"PENDIENTE");
             productos.add(producto);
        
        
        }
       
        
    
    }
    
  public String verProductos(){
      String lista = "";
      for(Producto producto: productos){
          lista+= "Nombre"+producto.getNombre() + "Estado" + producto.getEstado() +"\n";
      
      }
      return lista;
  
  
  }
    /**
     * 
     * @param articulo : se envia el nombre del producto que sera procesado
     * @param procesarPago
     */
    
   
public void procesarPago(String articulo, JFrame frame) {
    if (articulo == null || articulo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Nombre de producto no válido");
        return;
    }
    
    String articuloBuscado = articulo.trim().toLowerCase();
    boolean productoExiste = false;

    for (Producto producto : productos) {
        String nombreProducto = producto.getNombre().trim().toLowerCase();
        
        System.out.println("Comparando: '" + nombreProducto + "' con '" + articuloBuscado + "'");
        
        if (nombreProducto.equals(articuloBuscado)) {
            productoExiste = true;
            if (producto.getEstado().equalsIgnoreCase("PENDIENTE")) {
                HiloProcesarPago hilo = new HiloProcesarPago(producto, frame);
                
                hilo.start();
                return;
            } else {
                JOptionPane.showMessageDialog(frame, "El producto '" + producto.getNombre() + "' ya ha sido pagado");
                return;
            }
        }
    }

    if (!productoExiste) {
        JOptionPane.showMessageDialog(frame, "Producto '" + articulo + "' no encontrado. ");
    }
}

    //public static void main(String[] args) throws PagoInvalidoException {
      //  Sistema s = new Sistema();
        //s.crearPago("hola", 4);
        //s.getProductos();
    //}
    
    
    
}
