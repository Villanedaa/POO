/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corredor;



/**
 *
 * @author Sebastian<sebastian.villanedag@autonoma.edu.co>
 * @since 05/06/2025
 * @version 1.0
 */

//Clase que representara a un corredor mediante un hilo
public class Corredor extends Thread{
    private String nombre;
    private  int pasos = 0;
    private int numero;
    //volatile es para que los hilos compartan la variable en tiempo real
    private static volatile boolean gano = false; 
    public Corredor(String nombre){
    
    this.nombre = nombre;
    numero = (int)(Math.random()*1000+1000);
    
    }
   // Corredor corredor = new Corredor("");
    
    //private boolean enEjecucion = true;
    
    //public void detener() {
      //  enEjecucion = false;
    //}

        @Override
       public void run(){
        //while(ejecucion){
        
            while(!gano){
                System.out.println( nombre + " paso : " + pasos);
                pasos+=1;
                try{
                    
                 Thread.sleep(numero);       
                }catch(InterruptedException e){
                            System.out.println("Algo fallo");
                            
                            break;
               }
                if (pasos == 10){
                    gano = true;
                    System.out.println(nombre + ": gano");
                   
                }
           
            }
        }
    
    
   
    
}
