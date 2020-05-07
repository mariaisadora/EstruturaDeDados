/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Recursão;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author ana.csantos119
 */
public class Ex_04_Produto {
    public static void main(String[] args) {
        int a=leInteiroPositivo();
        int b=leInteiroPositivo();
        System.out.println(produto2Numeros(a,b));
    }

    public static int produto2Numeros(int a, int b) {
       if(b==1){
           return a;
       } else {
           return a+ produto2Numeros(a,b-1);
       }
    }
}
