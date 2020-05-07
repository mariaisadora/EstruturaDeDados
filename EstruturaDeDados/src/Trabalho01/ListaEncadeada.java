package Trabalho01;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class ListaEncadeada {

    No inicio;

    //Cria lista vazia
    public ListaEncadeada() {
        this.inicio = null;
    }

    //Verifica se a lista está vazia
    public boolean vazia() {
        return inicio == null;
    }

    //Inserir no início da lista
    public void insereInicio(String elemento) {
        No novo = new No(elemento, inicio);
        inicio = novo;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = inicio;

        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProximo(); //ir para o próximo nó da lista
        }
        return strLista;
    }

    public void insereFinal(String elemento) {
        No novo = new No(elemento, null);
        No temp = inicio;

        if (temp == null) { //Lista vazia
            inicio = novo;
        } else {
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }
    }

    public boolean buscaLinearIt(String x) {
        No temp = inicio;

        while (temp != null) {
            if (temp.getElemento() == x) {//Achou
                return true;
            }
            temp = temp.getProximo();
        }
        return false;//Não achou
    }

    public void removeOrdenado(String elemento) {
        if (vazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No temp = inicio;
            No anterior = null;

            while (temp != null && temp.getElemento() != elemento) {
                anterior = temp;
                temp = temp.getProximo();
            }
            //Somente 1 nó na lista
            if (anterior == null) {
                inicio = inicio.getProximo(); //Remove do início
            } else {
                if (temp != null && temp.getElemento() == elemento) {
                    anterior.setProximo(temp.getProximo()); //removendo o vínculo temp
                } else {
                    System.out.println(elemento + " NÃO está lista");
                }
            }
        }

    }

    public int compactador(String[] arqStr) {
        ListaEncadeada listaAux = new ListaEncadeada();
        No temp = inicio;
        int count = 0;

        for (int i = 0; i < arqStr.length; i++) {
            insereInicio(arqStr[i]);
        }
        while (temp != null) {
            listaAux.buscaLinearIt(temp.getElemento());
            temp = temp.getProximo();
        }

        return count;

    }

}
