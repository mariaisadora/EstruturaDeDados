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
public class ADO3_Ex_12_2_MenorElemento {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.printf("O menor elemento do vetor = %d\n",
                                      menorElementoVetorR(v));
    }

    public static int  menorElementoVetorIt(int[] v) {
        int menor=v[0];
        
        for(int i=1; i <v.length; i++)
            if (v[i]<menor)
                menor=v[i];
        
        return menor;   
    }

    public static int  menorElementoVetorR(int[] v) {
        return menorElementoVetorR(v,v.length);
    }
    
    /*
     Se n=1, ele é o único e o menor do vetor é v[0]
     Se n>1, o menor no vetor v[0...n-1] será o mínimo entre x=v[n-1] e
     vetor v[0...n-2]
     */
    public static int  menorElementoVetorR(int[] v, int n) {
        if(n==1)
            return v[0];
        
        if (menorElementoVetorR(v,n-1) < v[n-1])
            return menorElementoVetorR(v,n-1);
        else
            return v[n-1];
    }
    
}
