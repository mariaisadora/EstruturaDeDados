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
public class Ex_08_09_RestoQuocDivisao {
    public static void main(String[] args) {
       int x=leInteiroPositivo();
       int y=leInteiroPositivo();
       System.out.println(restoDiv(x,y));
       System.out.println(quocDiv(x,y));
    }

    public static int restoDiv(int x, int y) {
      if(x<y)
          return x;
      return restoDiv(x-y,y);
    }
    public static int quocDiv(int x, int y) {
      if(x<y)
          return 0;
      return 1 + quocDiv(x-y,y);
    }
}
