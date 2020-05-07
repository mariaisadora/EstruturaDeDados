/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_Lista_Encadeada;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_06_Intr_Lista_Encadeada.ADO3_Ex_12_3_SomaElementos.somaElementosVetorR;

/**
 *
 * @author anacris
 */
public class ADO3_Ex_12_4_MediaElementos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.printf("A média dos elementos do vetor = %f\n",
                                      mediaElementosVetorR(v));
    }
    public static double  mediaElementosVetorIt(int[] v) {
        int soma=0;
        
        for(int i=0; i <v.length; i++)
                soma += v[i];
        
        return soma/(double)v.length;   
    }
    
    public static double  mediaElementosVetorR(int[] v) {
        return mediaElementosVetorR(v,v.length);
    }
    public static double  mediaElementosVetorR(int[] v, int n) {   
        if(n==1)
            return v[0];
        
        return (v[n-1] + somaElementosVetorR(v,n-1))/(double)n;
      
    }
   
}
