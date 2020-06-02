/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_14_Tree;

import Aula_13_Tree.*;

/**
 *
 * @author anacris
 */
public class testaABB {
    public static void main(String[] args) {
        ABB tree = new ABB();
        
        tree.insere(8);
        tree.insere(2);
        tree.insere(5);
        tree.insere(7);
        tree.insere(9);
        tree.insere(3);
        tree.insereR(11);
        //System.out.println(tree);
        System.out.print("Pré-Ordem: ");
        tree.preOrdem();
        System.out.println();
        System.out.print("In-Ordem: ");
        tree.inOrdem();
        System.out.println();
        System.out.print("Pós-Ordem: ");
        tree.posOrdem();
        System.out.println();
        int num= 3;
        if(tree.buscaIt(num) != null) {
            System.out.println("Achou! " + tree.buscaIt(num).getElemento());
        } else {
            System.out.println("NAO Achou! " + num);
        }
        num = 33;
        if(tree.buscaR(num) != null) {
            System.out.println("Achou! " + tree.buscaR(num).getElemento());
        } else {
            System.out.println("NAO Achou! " + num);
        }
        
        System.out.println("A árvore tem " + tree.contaNos() + " nós!");
        System.out.println("A altura da árvore = " + tree.altura());
        System.out.println();
        System.out.print("In-Ordem dos nós FOLHAS: ");
        tree.inOrdemFolhas();
        System.out.println("\nO menor nó = " + tree.menorIt().getElemento());
        System.out.println("\nO menor nó = " + tree.menor().getElemento());
        System.out.println("\nO maior nó = " + tree.maior().getElemento());
        /*System.out.println("\nRemovendo o nó 3 = " + tree.remove(3));
        System.out.print("Pré-Ordem: ");
        tree.preOrdem();
        System.out.println("\nRemovendo o nó 9 = " + tree.remove(9));
        System.out.print("Pré-Ordem: ");
        tree.preOrdem();
        System.out.println("\nRemovendo o nó 8 = " + tree.remove(8));
        System.out.print("Pré-Ordem: ");
        tree.preOrdem(); */
        System.out.println("\nO sucessor nó 3 = " + 
                tree.sucessor(tree.buscaR(3)).getElemento());
        System.out.println("\nO sucessor nó 5 = " + 
                tree.sucessor(tree.buscaR(5)).getElemento());
        System.out.println("\nO sucessor nó 7 = " + 
                tree.sucessor(tree.buscaR(7)).getElemento());
        System.out.println("\nO sucessor nó 8 = " + 
                tree.sucessor(tree.buscaR(8)).getElemento());
        /*System.out.println("\nO sucessor nó 11 = " + 
                tree.sucessor(tree.buscaR(11)).getElemento()); */
    }
}
