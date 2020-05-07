/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;

/**
 *
 * @author ana.csantos119
 */
public class Ex_08_Inter_Uniao {
    public static void main(String[] args) {
       
        int n1=leInteiroPositivo();
        int v1[];
        v1=leVetorAleatorio(n1);
        exibeVetor(v1);
        int n2=leInteiroPositivo();
        int v2[];
        v2=leVetorAleatorio(n2);
        exibeVetor(v2);
        
        //Intersecção de 2 vetores
        int inter[]=new int[v1.length];
        exibeVetor(inter);
        int tam1=inter2Vetores(v1,v2,inter);
        exibeVetor(inter);
        
        //Uniao de 2 vetores
        int uniao[]=new int[v1.length+v2.length];
        int tam2=uniao2Vetores(v1,v2,uniao);
        exibeVetor(uniao);
        
    }

    public static int inter2Vetores(int[] v1, int[] v2,int[] v3) {
        int k=0;
        
        //Percorrer o 1o. vetor e buscar no 2o. vetor
        for(int i=0; i<v1.length;i++){
            if(buscaLinear(v2,v1[i])!=-1){
                v3[k]=v1[i];
                k++;
            }  
        }
        return k; //tamanho real do vetor intersecção  
    }

    public static int uniao2Vetores(int[] v1, int[] v2, int[] uniao) {
        int k=v1.length;
        for(int i=0; i<v1.length;i++){
            uniao[i]=v1[i];
        }
        
        //Percorrer o 2o. vetor e buscar no 1o. vetor
        for(int i=0; i<v2.length;i++){
            if(buscaLinear(v1,v2[i])==-1){
                uniao[k]=v2[i];
                k++;
            }  
        }
        return k; //tamanho real do vetor intersecção  
    }
}
