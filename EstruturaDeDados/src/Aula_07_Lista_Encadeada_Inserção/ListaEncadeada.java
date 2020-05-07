/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Lista_Encadeada_Inserção;

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
        insereOrdenadoR(null, ini, elemento);
    }

    public void insereOrdenadoR(No anterior, No temp, int elemento) {
        //Lista vazia
        if (temp == null && anterior == null) {
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            //Insere entre dois nós
            No novo = new No(elemento, ini);
            if (anterior != null && temp.getElemento() > novo.getElemento()) {
                novo.setProx(temp);
                anterior.setProx(novo);
            } else {
                //Insere no início
                if (anterior == null && temp.getElemento() > novo.getElemento()) {
                    novo.setProx(ini);
                    ini = novo;
                } else {
                    //Insere no final
                    if (anterior.getElemento() < novo.getElemento() && temp == null) {
                        anterior.setProx(novo);
                        novo.setProx(null);
                    } else {
                        insereOrdenadoR(temp, temp.getProx(), elemento);
                    }
                }
            }
        }
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

    public int Contador() {
        int cont = 0;
        No temp = ini;
        while (temp != null) {
            temp = temp.getProx();
            cont++;
        }
        return cont;

    }

    public No menorValor() {
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

}
