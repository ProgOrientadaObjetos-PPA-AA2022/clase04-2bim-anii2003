/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina ag1 = new AutomovilGasolina("Ana Churo","LCD-710",20,30,10);        
        AutomovilDiesel ad1 = new AutomovilDiesel("Jaime Churo","LBA-5466", 20, 20, 10);
                        
        ag1.establecerValorCancelar();
        ad1.establecerValorCancelar();        
        
        System.out.println(ag1);
        System.out.println("-------------------------------------");
        System.out.println(ad1);
    }                
}
