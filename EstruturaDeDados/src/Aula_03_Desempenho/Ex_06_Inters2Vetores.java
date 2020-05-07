/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_09_Intercalacao.bubbleSort;

/**
 *
 * @author ana.csantos119
 */
public class Ex_06_Inters2Vetores {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v1[]=leVetorAleatorio(n);
        System.out.println("O vetor v1: ");
        exibeVetor(v1);
        bubbleSort(v1);
        exibeVetor(v1);
        int v2[]=leVetorAleatorio(n);
        System.out.println("O vetor v2: ");
        exibeVetor(v2);
        bubbleSort(v2);
        exibeVetor(v2);      
        inters2Vetores(v1,v2);     
    }

    public static void inters2Vetores(int[] v1, int[] v2) {
       int i=0;
       int j=0;
        System.out.println("Os elementos da intersecção são:");
       while (i<v1.length && j<v2.length){
           if(v1[i]==v2[j]){
               System.out.print(v1[i]+ " ");
               i++;
               j++;
           } else {
               if (v1[i]<v2[j]){
                   i++;
               } else {
                   j++;
               }
           }
       }
    }

    private static void exibeVetorAleatorio(int[] v1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
