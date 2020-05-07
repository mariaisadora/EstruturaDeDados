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
public class ADO3_Ex_12_1_BuscaLinear {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Digite qual elemento deseja buscar: ");
        int x=leInteiroPositivo();
        int pos=buscaLinearR(v,x);
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
     public static int buscaLinearR(int [] v, int x){
         return buscaLinearR(v,x,v.length);
     }

     /*
     Se n=0, o vetor está vazio e x não está em v[0..n-1]
     Se n>0, x está em v[0...n-1] se, e somente se, ou x=v[n-1]
     ou x está no vetor v[0...n-2]
     */
     public static int buscaLinearR(int [] v, int x, int n){
         if (n==0)
             return -1;
        
         if (x==v[n-1])
             return n-1;
         
         return buscaLinearR(v,x,n-1);
     }
}
