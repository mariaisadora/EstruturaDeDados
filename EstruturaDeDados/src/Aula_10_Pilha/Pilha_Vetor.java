/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.logging.Logger;

/**
 *
 * @author anacris
 */
public class Pilha_Vetor {
    private Object item[];
    private int topo;

    //Cria uma Pilha vazia
    public Pilha_Vetor(int maxPilha) {
        this.item = new Object[maxPilha];
        this.topo = 0;
    }
    
    //Método para inserir ou empilhar um elemento
    public void push(Object x) throws Exception{
        
        if(this.cheia()){
            throw new Exception ("Erro: A pilha está cheia!");
        }
        this.item[this.topo++] = x;   
            
    }
    
    //Método para remover ou desempilhar um elemento
    public Object pop() throws Exception{
        
        if(this.vazia()){
            throw new Exception ("Erro: A pilha está vazia!");
        }
        this.topo--;
        return this.item[this.topo];   
            
    }
    
    //Pilha vazia
    public boolean vazia(){
        return this.topo == 0;
    }
    
    //Pilha cheia
    public boolean cheia(){
        return this.topo == this.item.length;
    }
    
    //Tamanho da pilha
    public int size(){
        return this.topo;
    }
    
    
}
