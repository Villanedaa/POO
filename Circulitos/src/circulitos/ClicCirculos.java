/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulitos;

/**
 *
 * @author Sebastian <sebastian.villanedag@autonoma.edu.co
 * @version 1.0
 * @since 28/08/2025
 * 
 * 
 */ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Graphics;
import java.util.Random;


public class ClicCirculos extends JPanel {
    /**
     * se crea un objeto de tipo Random
     */
    
    Random random = new Random();

    private final ArrayList<Point> puntos = new ArrayList<>();
    private final ArrayList<Point> cuadrados = new ArrayList<>();

    public ClicCirculos() {
        // Agregamos un listener para detectar los clics del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                
                
                puntos.add(e.getPoint()); // Guardamos el punto del clic
                repaint(); // Redibujamos el panel
                
            }
        });
        
        // Agregamos un listener para detectar las teclas presionadas
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Verificamos si hay al menos un círculo en la lista
                if (!puntos.isEmpty()) {
                    Point ultimoPunto = puntos.get(puntos.size() - 1);
                    // Desplazamos el último círculo con las teclas de dirección
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            ultimoPunto.translate(0, -5); // Mover hacia arriba
                            break;
                        case KeyEvent.VK_DOWN:
                            ultimoPunto.translate(0, 5); // Mover hacia abajo
                            break;
                        case KeyEvent.VK_LEFT:
                            ultimoPunto.translate(-5, 0); // Mover hacia la izquierda
                            break;
                        case KeyEvent.VK_RIGHT:
                            ultimoPunto.translate(5, 0); // Mover hacia la derecha
                            break;
                        
                              
                    }
                    
                }
                 if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    generarCirculosAleatorios(1);   
                    repaint();
                }
            }
        });

        setFocusable(true); 
    }

    @Override
    /**
     * 
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        for (Point p : puntos) {
            g.drawOval(p.x - 10, p.y - 10, 20, 20); // Dibuja círculos centrados en el clic
        }
    }
    /**
     * 
     * @param x
     * @return : retorna el parametro x
     */
    public int getX(int x){
    
        return x;
    }
    /**
     * 
     * @param y
     * @return retorna el parametro Y
     */
    public int getY(int y){

       return y;
    }
    
   private void generarCuadradoAleatorio(int cantidad){
       int ancho = getWidth();
       int alto = getHeight();
       
   
   
   }
   /**
    *  Metodo para generar circulos mediante eventos de teclado
    * @param cantidad : cantidad de circulos que generamos cuando se llama el metodo
    */
   private void generarCirculosAleatorios(int cantidad) {
    int ancho = getWidth();
    int alto = getHeight();
    int radio = 10; // DIAMETRO 20 PIXELES

    for (int i = 0; i < cantidad; i++) {
        boolean colocado = false;
        int intentos = 0;
        
        while (!colocado && intentos < 10000) {
            int x = radio + random.nextInt(ancho - 2 * radio);
            int y = radio + random.nextInt(alto - 2 * radio);
            Point nuevoPunto = new Point(x, y);

            boolean seSuperpone = false;
            for (Point p : puntos) {
                double distancia = nuevoPunto.distance(p);
                if (distancia < 2 * radio) { // Se tocan o se superponen
                    seSuperpone = true;
                    break;
                }
            }

            if (!seSuperpone) {
                puntos.add(nuevoPunto);
                colocado = true;
            }
            
           
            intentos++;
        }
         if (!colocado) {
            JOptionPane.showMessageDialog(this, "no hay espeacio");
              break; // Dejamos de intentar a
         }
          
    }
    
}


    
    
    
    

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujar círculos con clic");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.setContentPane(new ClicCirculos());
        ventana.setVisible(true);
    }
}