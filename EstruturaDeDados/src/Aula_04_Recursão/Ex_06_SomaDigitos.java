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
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println("Versão iterativa: ");
        System.out.println(somaDigitosIt(n));
        System.out.println("Versão recursiva: ");
        System.out.println(somaDigitosR(n));
    }

    public static int somaDigitosIt(int n) {
      int soma=0;
      while(n>0){
          int resto=n%10;
          soma=soma+resto;
          n=n/10; //atualização
      }
      return soma;
    }
    public static int somaDigitosR(int n) {
      if(n<10)
          return n;
      return n%10 + somaDigitosR(n/10);
    }
}
