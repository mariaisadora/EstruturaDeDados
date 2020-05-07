/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_Lista_Encadeada;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class ADO3_Ex_12_3_SomaElementos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.printf("A soma elemento do vetor = %d\n",
                                      somaElementosVetorR(v));
    }
    public static int  somaElementosVetorIt(int[] v) {
        int soma=0;
        
        for(int i=0; i <v.length; i++)
                soma += v[i];
        
        return soma;   
    }
    
    public static int  somaElementosVetorR(int[] v) {
        return somaElementosVetorR(v,v.length);
    }
    public static int  somaElementosVetorR(int[] v, int n) {   
        if(n==1)
            return v[0];
        
        return v[n-1] + somaElementosVetorR(v,n-1);
      
    }
   
}
