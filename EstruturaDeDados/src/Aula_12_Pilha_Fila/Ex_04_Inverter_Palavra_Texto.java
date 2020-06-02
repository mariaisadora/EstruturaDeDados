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
public class Ex_04_Inverter_Palavra_Texto {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um texto (final com .): ");
        String texto = entrada.nextLine();
        
        System.out.println("Texto com palavras invertidas: "+ inPalavraTexto(texto));
        
    }

    private static String inPalavraTexto(String texto) throws Exception {
        Pilha p = new Pilha();
        String inv = "";
        
        for(int i=0; i<texto.length(); i++){
            char caracter = texto.charAt(i);
            if(caracter == ' ' || caracter == '.' || i == texto.length()-1){
                while(!p.vazia()){
                    inv = inv + p.pop();
                }
                inv = inv + caracter; //Insere o espaço ou ponto
                
            } else {
                p.push(caracter);
             }
        }
        return inv;
    }
}

