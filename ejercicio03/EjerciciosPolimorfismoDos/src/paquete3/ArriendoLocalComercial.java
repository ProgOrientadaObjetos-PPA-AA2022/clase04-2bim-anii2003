/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Arriendo;
import paquete4.Propietario;

/**
 *
 * @author reroes
 */
public class ArriendoLocalComercial extends Arriendo {

    protected double valorAdicionalFijo;

    public ArriendoLocalComercial(Propietario a, double cuotaB) {
        super(a, cuotaB);
    }

    /*@Override
    public void establecerNombreArrendatario(String nombre) {
        nombreArrendatario = nombre.toUpperCase();
    }*/
    public void establecerArrendatario(Propietario a) {
        arrendatario = a;
    }

    public void establecerValorAdicionalFijo(double x) {
        valorAdicionalFijo = x;
    }

    @Override
    public void establecerArriendoMensual() {
        arriendoMensual = obtenerCuotaBase() + obtenerValorAdicionalFijo();
    }

    public double obtenerValorAdicionalFijo() {
        return valorAdicionalFijo;
    }

    public Propietario obtenerArrendatario() {
        return arrendatario;
    }

    @Override
    public String toString() {
        String cadena = String.format("Ariendo de Local Comercial\n"
                + "%s\n"
                + "Cuota base: %.2f\n"
                + "Valor adicional fijo: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerArrendatario(),
                obtenerCuotaBase(),
                obtenerValorAdicionalFijo(),
                obtenerArriendoMensual());

        return cadena;
    }
}
