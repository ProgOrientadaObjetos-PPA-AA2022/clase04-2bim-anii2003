/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numeroGalones;
    private double costoGalon;
    private double iva = 10;

    public AutomovilGasolina(String n, String p, int num, double c, double i) {
        super(n, p);
        numeroGalones = num;
        costoGalon = c;
        iva = i;
    }

    public void establecerNumeroGalones(int n) {
        numeroGalones = n;
    }

    public void establecerCostoGalon(double c) {
        costoGalon = c;
    }
    
    public void establecerIva(int i){
        iva = i;
    }
    
    public void establecerValorCancelar(){
        valorCancelar = costoGalon * numeroGalones + ((costoGalon*numeroGalones)*iva/100);
    }

    public int obtenerNumeroGalones() {
        return numeroGalones;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s",super.toString());
        cadena = String.format("%s"
                + "Número de galones: %d\n"
                + "Costo por galón: %.2f\n"
                + "Iva: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                cadena,
                numeroGalones,
                costoGalon,
                iva,
                valorCancelar);
        return cadena;
    }
    
}
