package Aula_10_Pilha;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anacris
 */
public class Ex_02_Pares_Impares {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        Pilha pares= new Pilha();
        Pilha impares = new Pilha();
        
        for(int i=0; i<10; i++){
            int num=r.nextInt(51);
            if(num%2==0) {
                pares.push(num);
            } else{
                impares.push(num);
            }
        }
        
        System.out.println("Pilha de Pares");
        while(!pares.vazia()){
            System.out.println(pares.pop());
        }
        System.out.println("Pilha de Impares");
        while(!impares.vazia()){
            System.out.println(impares.pop());
        }
    }
}
