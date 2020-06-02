package Trabalho02;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class FreqPalavra {

    private No raiz;

    //Cria uma árvore vazia
    public FreqPalavra() {
        this.raiz = null;
    }

    //Insere um elemento na árvore
    public void insere(String elemento) {
        No pai = null;
        No p = raiz;
        No novo = new No(elemento, null, null);

        //Busca onde inserir o novo No
        while (p != null) {
            pai = p;
            int valor = p.getElemento().compareToIgnoreCase(elemento);

            if (valor > 0) {
                p = p.getEsq();
            } else if (valor < 0) {
                p = p.getDir();
            } else {
                break;
            }
        }
        //Verificar árvore vazia
        if (pai == null) {
            raiz = novo;
            return;
        }

        int valor1 = pai.getElemento().compareToIgnoreCase(elemento);

        if (valor1 > 0) {
            pai.setEsq(novo);
        } else if (valor1 < 0) {
            pai.setDir(novo);
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    public void preOrdem(No p) {
        if (p != null) {
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    public void inOrdem(No p) {
        if (p != null) {
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    public void posOrdem(No p) {
        if (p != null) {
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    public int contaNos(){
        return contaNos(raiz);
    }
    
    public int contaNos(No p){
        if(p == null)
            return 0;
        
        return contaNos(p.getEsq()) + contaNos(p.getDir()) + 1;
    }
    public int altura(){
        return altura(raiz);
    }
    
    public int altura(No p){
        if(p == null)
            return -1; //a altura da árvore vazia
        
        int altura_esq = altura(p.getEsq());
        int altura_dir = altura(p.getDir());
        if (altura_esq > altura_dir)
            return altura_esq + 1;
        else
            return altura_dir + 1;
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }

}
