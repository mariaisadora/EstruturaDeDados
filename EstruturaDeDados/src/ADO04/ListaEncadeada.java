/*10) Intercalação de duas listas ordenadas com menor complexidade
 **11) União de duas listas quaisquer
 **12) Intersecção de duas listas quaisquer
 */
package ADO04;

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
    public void insereInicio(int elemento) {
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

    public void insereFinal(int elemento) {
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

    public boolean buscaLinearIt(int x) {
        No temp = inicio;

        while (temp != null) {
            if (temp.getElemento() == x) {//Achou
                return true;
            }
            temp = temp.getProximo();
        }
        return false;//Não achou
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

}
