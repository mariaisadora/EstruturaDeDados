/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_13_Tree;

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
    }
}
