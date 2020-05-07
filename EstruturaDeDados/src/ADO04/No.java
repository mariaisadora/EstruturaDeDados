package ADO04;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class No {

    private int elemento;
    private No proximo;
    public No inicio;

    public No(int elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }

}
