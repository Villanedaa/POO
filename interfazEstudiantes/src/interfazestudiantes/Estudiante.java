/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazestudiantes;

/**
 *
 * @author Sebastian
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private double nota;
    
     public Estudiante(String nombre, int edad , float nota){
    
                this.nombre = nombre;
                this.edad = edad;
                this.nota = nota;
    
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
