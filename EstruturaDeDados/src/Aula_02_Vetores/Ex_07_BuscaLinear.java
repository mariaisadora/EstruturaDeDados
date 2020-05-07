/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author ana.csantos119
 */
public class Ex_07_BuscaLinear {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println(n);
        int v[];
        v=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Digite qual elemento deseja buscar: ");
        int x=leInteiroPositivo();
        int pos=buscaLinear(v,x);
        if(pos==-1){
            System.out.printf("%d não está no vetor\n",x);
        } else{
            System.out.printf("%d está na posição %d do vetor\n",x,pos);
        }
    }

    public static int buscaLinear(int[] v, int x) {
        for(int i=0; i<v.length;i++){
            if(v[i]==x){
                return i; //Achou
            }
        }
        return -1; //Não achou
    }

    
}
