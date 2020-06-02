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
public class ABB {
    private No raiz;
    
    //Cria uma árvore vazia
    public ABB(){
        this.raiz = null;
    }
    //Insere um elemento na árvore
    public void insere (int elemento){
        No pai = null;
        No p = raiz;
        No novo = new No(elemento,null,null);
        
        //Busca onde inserir o novo No
        while (p != null){
            pai = p;
            if(elemento < p.getElemento()){
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        //Verificar árvore vazia
        if(pai == null){
            raiz = novo;
            return;
        }
        if(elemento < pai.getElemento()){
            pai.setEsq(novo);
        } else{
            pai.setDir(novo);
        }
    }
    
    public void insereR(int elemento){
        if (raiz == null){
            raiz = new No(elemento, null, null);
            return;
        }
        No novo = new No(elemento, null, null);
        insereR(raiz,novo);
    }
    
    public void insereR(No p, No novo){
        if (novo.getElemento() < p.getElemento()){
            if (p.getEsq() == null){
                p.setEsq(novo);
                return;
            }
            insereR(p.getEsq(),novo);
        } else {
            if (p.getDir() == null){
                p.setDir(novo);
                return;
            }
            insereR(p.getDir(),novo);
        }
    }
    public void preOrdem(){
        preOrdem(raiz);
    }
    public void preOrdem(No p){
        if(p != null){
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    public void inOrdem(){
        inOrdem(raiz);
    }
    public void inOrdem(No p){
        if(p != null){
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }
    public void posOrdem(){
        posOrdem(raiz);
    }
    public void posOrdem(No p){
        if(p != null){
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    
    public No buscaIt(int elemento){
        No p = raiz;
        
        while (p != null){
            if(elemento  == p.getElemento()){
                return p; //Achou
            }
            if(elemento < p.getElemento()){
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
       }
       return null; //NAO achou
    }
    
    public No buscaR(int elemento){
        return buscaR(elemento, raiz);
    }
    
    public No buscaR(int elemento, No p){
        if(p == null) {
            return null; //NAO achou
        }
       if(elemento  == p.getElemento()){
            return p; //Achou
       }
       if(elemento < p.getElemento()){
            return buscaR(elemento, p.getEsq());
        } else {
            return buscaR(elemento, p.getDir());
        }
        
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }
    
}
