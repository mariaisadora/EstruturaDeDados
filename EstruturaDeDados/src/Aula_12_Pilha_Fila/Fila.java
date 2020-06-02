/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Pilha_Fila;

import Aula_10_Pilha.No;

/**
 *
 * @author anacris
 */
public class Fila {
    private No first;
    private No last;
    
    //Cria uma fila vazia
    public Fila(){
        this.first=null;
        this.last=null;
    }
    
    //Verifica se a fila está vazia
    public boolean isEmpty(){
        return this.first == null && this.last == null;
    }
    
    //Enfileira um elemento (Inserir no final)
    public void enqueue(Object x){
        No novo = new No(x, null);
        //Verifica se tem mais de um elemento
        if(this.last != null){
            this.last.setProx(novo);
            this.last=novo;
            return;
        }
        //Se fila vazia, será o primeiro
        this.first = novo;
        this.last = novo;
    }
    
    //Desenfileirar um elemento (Remover do remoção)
    public Object dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception ("Erro: A fila está vazia!");
        }
        Object elemento = this.first.getElemento();
        this.first = this.first.getProx();
        return elemento;
    }
    
    //Tamanho da fila
    public int size(){
        No temp = this.first;
        int cont=0;
        
        while(temp!=null){
            temp=temp.getProx();
            cont++;
        }
        return cont;
    }
    
    //Tamanho da fila
    public int size2(){
        int cont=1;
        
        for(No temp=this.first; temp!=this.last;temp=temp.getProx()){
            cont++;
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }
    
}
