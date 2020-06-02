/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_Bem_Formada {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma sequencia de () e []: ");
        String seq = entrada.nextLine();
        
        Pilha p = new Pilha();
        
        //Percorrer a sequencia
        for(int i=0; i< seq.length(); i++){
            char c = seq.charAt(i);
            
            //Analisar as aberturas
            if(c == '(' || c == '['){
                p.push(c);
            } else {
                //Verificar se a pilha está vazia
                if (p.vazia()) {
                    System.out.println("Não está bem formada a sequencia");
                    return;
                }
                char charTopo = (char) p.pop();
                //Verificar as compatibilidades
                if(charTopo == '(' && c == ']'){
                    System.out.println("Não está bem formada a sequencia");
                    return;
                }
                if(charTopo == '[' && c == ')'){
                    System.out.println("Não está bem formada a sequencia");
                    return;
                }
                
            }
        }
        //Terminou de percorrer a sequencia e analisa a pilha
        if(p.vazia()){
            System.out.println("Está bem formada a sequencia");
        } else {
            System.out.println("Não está bem formada a sequencia");
        }
        
    }
}
