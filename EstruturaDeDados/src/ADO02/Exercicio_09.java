/*Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona 
 o primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos
 menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua
 direita.
 No vetor {5, 6, 2, 7, 9, 1, 8, 3,7} após ser rearranjado teríamos {1, 3, 2, 5,
 9, 7, 8, 6, 7}. A função deve rearranjar o vetor com a complexidade O(n).
 */
package ADO02;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class Exercicio_09 {

    public static void main(String[] args) {
        int V[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        exibir(V);
        ordenacao(V);
        exibir(V);
    }

    private static void exibir(int[] V) {
        System.out.println("Vetor: ");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println("");

    }

    private static void ordenacao(int[] V) {
        int i = 1;
        int j = V.length - 1;
        int p = V[0];

        while (i != j) {

            if (V[i] > p && V[j] < p) {
                int aux = V[i];
                V[i] = V[j];
                V[j] = aux;
            }
            if (V[i] < p) {
                i++;
            }
            if (V[j] > p) {
                j--;
            }
        }

        int aux = V[i - 1];
        V[i - 1] = p;
        V[0] = aux;

    }

}
