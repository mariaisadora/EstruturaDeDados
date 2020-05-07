/*10) Intercalação de duas listas ordenadas com menor complexidade
 **11) União de duas listas quaisquer
 **12) Intersecção de duas listas quaisquer
 */
package ADO04;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class testaListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada listaA = new ListaEncadeada();
        ListaEncadeada listaB = new ListaEncadeada();
        ListaEncadeada listaIntercalacao = new ListaEncadeada();
        ListaEncadeada listaUniao = new ListaEncadeada();
        ListaEncadeada listaInterseccao = new ListaEncadeada();

        //Inserir na lista A
        listaA.insereFinal(2);
        listaA.insereFinal(1);
        listaA.insereFinal(3);
        listaA.insereFinal(0);
        listaA.insereFinal(7);
        listaA.insereFinal(9);

        //Inserir na lista B
        listaB.insereFinal(0);
        listaB.insereFinal(2);
        listaB.insereFinal(5);
        listaB.insereFinal(6);
        listaB.insereFinal(8);
        listaB.insereFinal(7);

        System.out.println("Lista A: " + listaA);
        System.out.println("Lista B: " + listaB);

        listaIntercalacao = intercalar(listaA, listaB);
        System.out.println("Intercalação:" + listaIntercalacao);
        listaUniao = concatenar(listaA, listaB);
        System.out.println("União:" + listaUniao);
        listaInterseccao = interseccao(listaA, listaB);
        System.out.println("Interseccão:" + listaInterseccao);

    }
     public static ListaEncadeada intercalar(ListaEncadeada listaA, ListaEncadeada listaB) {
        No tempA = listaA.inicio;
        No atualA = listaB.inicio;
        No tempB = listaA.inicio.getProximo();
        No atualB = listaB.inicio.getProximo();

        while ((tempB != null) && (atualB != null)) {
            tempA.setProximo(atualA);
            atualA.setProximo(tempB);
            tempA = tempB;
            tempB = tempB.getProximo();
            atualA = atualB;
            atualB = atualB.getProximo();
        }
        tempA.setProximo(atualA);
        if (atualB == null) {
            atualA.setProximo(tempB);
        }
        listaB.inicio = null;
        return listaA;
    }

    public static ListaEncadeada concatenar(ListaEncadeada listaA, ListaEncadeada listaB) {
        No temp = listaA.inicio;
        while (temp.getProximo() != null) {
            temp = temp.getProximo();
        }
        temp.setProximo(listaB.inicio);
        return listaA;
    }

    //Problema na saída da função interseccao, ela só funciona quando as outras
    //funções estão comentadas.
    
    public static ListaEncadeada interseccao(ListaEncadeada listaA, ListaEncadeada listaB) {
        ListaEncadeada listaC = new ListaEncadeada();
        No tempA = listaA.inicio;

        while (tempA != null) {
            if (listaB.buscaLinearIt(tempA.getElemento())) {
                listaC.insereFinal(tempA.getElemento());
            }
            tempA = tempA.getProximo();
        }
        return listaC;
    }

}
