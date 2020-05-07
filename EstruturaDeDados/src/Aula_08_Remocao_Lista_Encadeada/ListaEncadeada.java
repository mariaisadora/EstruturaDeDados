/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remocao_Lista_Encadeada;

import Aula_07_Lista_Encadeada_Inserção.*;
import Aula_06_Intr_Lista_Encadeada.No;

/**
 *
 * @author anacris
 */
public class ListaEncadeada {

    private No ini;

    //Cria lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    //Verifica se a lista está vazia
    public boolean vazia() {
        return ini == null;
    }

    //Inserir no início da lista
    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx(); //ir para o próximo nó da lista
        }
        return strLista;
    }

    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;

        if (temp == null) { //Lista vazia
            ini = novo;
        } else {
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public void insereFinalR(int elemento) {
        insereFinalR(ini, elemento);
    }

    public void insereFinalR(No temp, int elemento) {
        //Lista vazia
        if (temp == null) {
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            if (temp.getProx() == null) { //Último No
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR(temp.getProx(), elemento);
            }
        }
    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }
        //Lista vazia
        if (anterior == null) {
            ini = novo;
        } else {
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR(ini, elemento);
    }

    public void insereOrdenadoR(No temp, int elemento) {
        //Lista vazia
        if (vazia() || ini.getElemento() >= elemento) {
            No novo = new No(elemento, ini);
            ini = novo;
            return;
        }
        //Insere no final - Problema aqui, está inserindo no início
        if (temp.getProx() == null) {
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        //Insere entre dois nós
        if (temp.getElemento() < elemento && temp.getProx().getElemento() >= elemento) {
            No novo = new No(elemento, ini);
            novo.setProx(temp.getProx());
            temp.setProx(novo);
            return;
        }

        insereOrdenadoR(temp.getProx(), elemento);

    }

    public boolean buscaLinearIt(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {//Achou
                return true;
            }
            temp = temp.getProx();
        }
        return false;//Não achou
    }

    public boolean buscaLinearR(int x) {
        return buscaLinearR(ini, x);
    }

    public boolean buscaLinearR(No temp, int x) {
        if (temp == null) {
            return false;
        }

        if (temp.getElemento() == x) {
            return true;
        }

        return buscaLinearR(temp.getProx(), x);
    }

    public No buscaLinearIt2(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {//Achou
                return temp;
            }
            temp = temp.getProx();
        }
        return null;//Não achou
    }

    public No buscaLinearR2(int x) {
        return buscaLinearR2(ini, x);
    }

    public No buscaLinearR2(No temp, int x) {
        if (temp == null || temp.getElemento() == x) {
            return temp;
        }

        return buscaLinearR2(temp.getProx(), x);
    }

    public void removeInicio() {
        if (vazia()) {
            System.out.println("Lista Vazia!");
        } else {
            //Possui ao menos um nó
            ini = ini.getProx();
        }
    }

    public void removeFinal() {
        if (vazia()) {
            System.out.println("Lista Vazia!");
        } else {
            //Possui ao menos um nó
            No temp = ini;
            No anterior = null;
            while (temp.getProx() != null) {
                anterior = temp;
                temp = temp.getProx();
            }
            //Apenas um nó na lista
            if (anterior == null) {
                ini = null; //lista vazia
            } else {
                anterior.setProx(null);
            }
        }
    }

    public void removeFinalR() {
        removeFinalR(null, ini);
    }

    public void removeFinalR(No anterior, No temp) {
        if (vazia()) {
            System.out.println("Lista Vazia!");
            return;
        }
        if (temp.getProx() == null) {
            anterior.setProx(null); //anterior passa a ser o último nó
            return;
        }
        //Apenas um nó na lista
        if (anterior == null && temp.getProx() == null) {
            ini = null; //lista vazia
            return;
        }
        removeFinalR(temp, temp.getProx());

    }

    public void removeOrdenado(int elemento) {
        if (vazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No temp = ini;
            No anterior = null;

            while (temp != null && temp.getElemento() != elemento) {
                anterior = temp;
                temp = temp.getProx();
            }
            //Somente 1 nó na lista
            if (anterior == null) {
                ini = ini.getProx(); //Remove do início
            } else {
                if (temp != null && temp.getElemento() == elemento) {
                    anterior.setProx(temp.getProx()); //removendo o vínculo temp
                } else {
                    System.out.println(elemento + " NÃO está lista");
                }
            }
        }

    }

    public int contaNos() {

        int cont = 0;
        /*
         No temp=ini;
        
         while (temp!=null){
         cont++;
         temp=temp.getProx();
         }
         */
        for (No temp = ini; temp != null; temp = temp.getProx()) {
            cont++;
        }
        return cont;
    }

    public No menorNo() {
        No temp = ini;
        No menorNo = temp;

        while (temp != null) {
            if (temp.getElemento() < menorNo.getElemento()) {
                menorNo = temp;
            }
            temp = temp.getProx();
        }
        return menorNo;
    }

    public void inverter() {
        No temp = ini;
        No anterior = null;
        No posterior = null;

        while (temp.getProx()!= null) {
            posterior=anterior;
            anterior=temp;
            temp=temp.getProx();
            anterior.setProx(posterior);
            
        }
        ini = temp;
        temp.setProx(anterior);
    }
}
