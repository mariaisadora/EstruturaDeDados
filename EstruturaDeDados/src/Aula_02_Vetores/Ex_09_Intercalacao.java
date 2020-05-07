/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_08_Inter_Uniao.inter2Vetores;

/**
 *
 * @author ana.csantos119
 */
public class Ex_09_Intercalacao {
    public static void main(String[] args) {
        int n1=leInteiroPositivo();
        int v1[];
        v1=leVetorAleatorio(n1);
        bubbleSort(v1);
        exibeVetor(v1);
        int n2=leInteiroPositivo();
        int v2[];
        v2=leVetorAleatorio(n2);
        bubbleSort(v2);
        exibeVetor(v2);
        
        
        //Intersecção de 2 vetores
        int merge[]=new int[v1.length+v2.length];
        exibeVetor(merge);
        intercalar2Vetores(v1,v2,merge);
        exibeVetor(merge);
    }

    public static void intercalar2Vetores(int[] v1, int[] v2, int[] merge) {
        int i=0, j=0, k=0;
        while (i<v1.length && j<v2.length){
           if (v1[i]<v2[j]){
               merge[k]=v1[i];
               i++; k++;
           } else {
               merge[k]=v2[j];
               j++; k++;
           }
        }
       //Analisar as sobras
       while (i<v1.length){
           merge[k]=v1[i];
           i++; k++;
       }
       while (j<v2.length){
           merge[k]=v2[j];
           j++; k++;
       }
    }
    
    public static void bubbleSort(int v[]){
        for(int i=0; i<v.length-1;i++){
            for (int j=0;j<v.length-1-i;j++){
                if(v[j]>v[j+1]){
                    int aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }
    
}
