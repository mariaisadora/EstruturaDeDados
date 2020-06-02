/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Pilha_Fila;

import Aula_10_Pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_05_Palindromo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        
        String pal_inv = inPalavra(palavra);
        
        System.out.println("Palavra invertida: "+ pal_inv);
        
        if(palavra.equals(pal_inv)){
            System.out.println(palavra + " É palindromo");
        } else {
            System.out.println(palavra + " NÀO é palindromo");
        }
    }

    private static String inPalavra(String palavra) throws Exception {
        Pilha p = new Pilha();
        String inv = "";
        
        for(int i=0; i<palavra.length(); i++){
            p.push(palavra.charAt(i));
        }
        
        while(!p.vazia()){
            inv = inv + p.pop();
        }
        
        return inv;
    }
}
