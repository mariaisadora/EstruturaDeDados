/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_09_Exercícios_Lista_Encadeada;

import Aula_08_Remocao_Lista_Encadeada.*;
import Aula_06_Intr_Lista_Encadeada.*;
//import Aula_07_Lista_Encadeada_Inserção.ListaEncadeada;

/**
 *
 * @author anacris
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        /*
        No p = new No(8,null);
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.getElemento());
        System.out.println(p.getProx());
        
        No q = new No(5,p);
        System.out.println(q);
        
        No r = new No(9,q);
        System.out.println(r);
*/
        ListaEncadeada lst = new ListaEncadeada();
        
        System.out.println(lst.vazia());
        lst.insereInicio(18);
        lst.insereInicio(10);
        lst.insereInicio(7);
        lst.insereFinal(23);
        lst.insereFinal(55);
        lst.insereFinal(67);
        lst.insereOrdenado(13);
        lst.insereOrdenado(60);
        lst.insereOrdenado(78);
        System.out.println(lst);
        System.out.println(lst.buscaLinearIt(55));
        System.out.println(lst.buscaLinearIt(42));
        System.out.println(lst.buscaLinearIt2(55));
        System.out.println(lst.buscaLinearIt2(42));
        System.out.println(lst.buscaLinearR(55));
        System.out.println(lst.buscaLinearR(42));
        System.out.println(lst.buscaLinearR2(55));
        System.out.println(lst.buscaLinearR2(42));
        lst.insereFinalR(89);
        System.out.println(lst);
        lst.insereOrdenadoR(3);
        lst.insereOrdenadoR(34);
        lst.insereOrdenadoR(91); 
        lst.insereOrdenadoR(95); 
        System.out.println(lst);
        lst.removeInicio();
        System.out.println(lst);
        lst.removeInicio();
        System.out.println(lst);
        lst.removeFinal();
        System.out.println(lst);
        lst.removeFinal();
        System.out.println("A lista tem = " + lst.contaNos() + " nos");
        System.out.println("Menor nó da lista =  " + lst.menorNo().getElemento());
        System.out.println(lst);
        lst.removeOrdenado(13); //remoção no início
        System.out.println(lst);
        lst.removeOrdenado(55); //remoção no meio
        System.out.println(lst);
        lst.removeOrdenado(67); //remoção no final
        System.out.println(lst);
        System.out.println("A lista tem = " + lst.contaNos() + " nos");
        System.out.println("Menor nó da lista =  " + lst.menorNo().getElemento());
        System.out.println(lst);
        lst.removeFinalR();
        System.out.println(lst);
        lst.removeFinalR();
        System.out.println(lst);
        lst.inverteNos();
        System.out.println(lst);
        
    }
}
