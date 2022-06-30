/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    private int numeroLitros;
    private double costoLitro;
    private double descuentoLitros;
    
    public AutomovilDiesel(String n, String p, int num, double c, double d){
        super(n, p);
        numeroLitros = num;
        costoLitro = c;
        descuentoLitros = d;
    }
    
    public void establecerNumeroLitros(int n) {
        numeroLitros = n;
    }

    public void establecerCostoLitro(double c) {
        costoLitro = c;
    }

    public void establecerDescuentoLitros(double d) {
        descuentoLitros = d;
    }
    
    public void establecerValorCancelar() {
       valorCancelar = costoLitro * (numeroLitros - ((descuentoLitros/100 ) * numeroLitros));
    }

    public int obtenerNumeroLitros() {
        return numeroLitros;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public double obtenerDescuentoLitros() {
        return descuentoLitros;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s",super.toString());
        cadena = String.format("%s"
                + "Número de litros: %d\n"
                + "Costo por litro: %.2f\n"
                + "Descuento Litros: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                cadena,
                numeroLitros,
                costoLitro,
                descuentoLitros,
                valorCancelar);
        return cadena;
    }    
}
