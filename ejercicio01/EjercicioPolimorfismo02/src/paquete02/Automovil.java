/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;
    
    public Automovil(String n, String p){
        nombrePropietario = n;
        placa = p;       
    }

    public void obtenerNombrePropietario(String n) {
        nombrePropietario = n;
    }

    public void establecerPlaca(String p) {
        placa = p;
    }

    public abstract void establecerValorCancelar();

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerPlaca() {
        return placa;
    }   
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del propietario: %s\n"
                + "Placa: %s\n",
                nombrePropietario,
                placa);
        return cadena;
    }    
    
}
