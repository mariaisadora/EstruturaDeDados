/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_09_Intercalacao.bubbleSort;

/**
 *
 * @author anacris
 *
 * Ex 07: Imprimir os elementos que estão em A[], mas que não estão em B[].
 * A função te complexidade O(n). O conjunto diferença é representado por A-B.
 * Exemplo:
 * A={1,2,3,4,5} e B=(3,4,5,6,7}
 * A-B= {1,2}
 */

public class ADO_2_Ex_7_AMenosB {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int A[]=leVetorAleatorio(n);
        System.out.println("O vetor A: ");
        //exibeVetor(A);
        bubbleSort(A);
        exibeVetor(A);
        int B[]=leVetorAleatorio(n);
        System.out.println("O vetor B: ");
        //exibeVetor(B);
        bubbleSort(B);
        exibeVetor(B);      
        diferenca2Vetores(A,B);     
    }
 /* Exemplo:
 * A={1,2,3,4,5} e B=(3,4,5,6,7}
 * A-B= {1,2}
    
   A={3,4,5,6} e B={1,2,3,4}
   A-B={5,6}
*/
    public static void diferenca2Vetores(int[] A, int[] B) {
      int i=0, j=0;
      
      System.out.println("Os elementos de A- B são:");
      while (i<A.length && j<B.length){
          if(A[i]==B[j]){
              i++;
              j++;
          } else {
              if ((A[i]<B[j] && B[j]==B.length-1) || A[i]<B[j]) {
                  System.out.print (A[i]+" ");
                  i++;
              } else {
                  if ((A[i]>B[j] && B[j]==B.length-1)) {
                     System.out.print (A[i]+" ");
                     i++;
                  } else {
                        if (A[i]>B[j]){
                           j++;
                       }  else {
                          j++;
                         }
                    }
               }
           }
        }
        System.out.println("");
    }

}
