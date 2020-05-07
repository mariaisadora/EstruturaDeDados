/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author ana.csantos119
 */
public class Ex_03_TrocaMaiorMenorVetor {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        trocaMaiorMenorVetor(v);
        exibeVetor(v);
    }

    public static void trocaMaiorMenorVetor(int[] v) {
      int iMaior=0;
      int iMenor=0;
      
      for (int i=1;i<v.length;i++){
          if (v[i]>v[iMaior]){
              iMaior=i;
          } else{
              if (v[i]<v[iMenor]){
                  iMenor=i;
              }
          }
      }
      //Troca do maior e menor
      int aux=v[iMaior];
      v[iMaior]=v[iMenor];
      v[iMenor]=aux;
    }
}
