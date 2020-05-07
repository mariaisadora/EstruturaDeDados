/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_Lista_Encadeada;

import Aula_07_Lista_Encadeada_Inserção.ListaEncadeada;

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
        System.out.println(lst.Contador());
    }
}
