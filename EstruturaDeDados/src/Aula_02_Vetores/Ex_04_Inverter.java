/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_04_Inverter {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println(n);
        int v[];
        //v=leVetor(n);
        v=leVetorAleatorio(n);
        exibeVetor(v);
        inverteVetor(v);
        System.out.println("O vetor invertido: ");
        exibeVetor(v);
    }

    public static int leInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número inteiro e positivo: ");
            n=sc.nextInt();
        }while (n<0 || n>100);
        return n;
    }

    public static int[] leVetor(int n) {
       int v[]=new int[n];
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite os elmentos do vetor:");
       for (int i=0; i<v.length;i++){
           System.out.printf("v[%d]=",i);
           v[i]=sc.nextInt();
       }
       return v;
    }
    
    public static int[] leVetorAleatorio(int n) {
       int v[]=new int[n];
       for (int i=0; i<v.length;i++){
           v[i]=(int)(Math.random()*50);
       }
       return v;
    }

    public static void exibeVetor(int[] v) {
        for (int i=0; i<v.length;i++){
            System.out.print(v[i]+ " ");
       }
       System.out.println("");
    }

    private static void inverteVetor(int[] v) {
        int ini=0;
        int fim=v.length-1;
        
        while (ini < fim){
            //Troca
            int aux=v[ini];
            v[ini]=v[fim];
            v[fim]=aux;
            ini++;
            fim--;
        }
    }
       
}
