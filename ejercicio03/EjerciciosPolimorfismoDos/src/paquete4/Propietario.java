/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author DELL
 */
public class Propietario {
    
    private String nombres;
    private String apellidos;
    private int edad;
    
    public Propietario(String n, String ap, int ed){
        nombres = n;
        apellidos = ap;
        edad = ed;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerApellidos(String n){
        apellidos = n;
    }
    
    public void establecerEdad(int e){
        edad = e;
    }
    
    public String obtenerNombre(){
        return nombres;
    }
    
    public String obtenerApellido(){
        return apellidos;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public String toString(){
        String cadena = String.format("-- DATOS DEL ARRENDATARIO --\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %d",
                nombres,
                apellidos,
                edad);
        return cadena;
    }
}
