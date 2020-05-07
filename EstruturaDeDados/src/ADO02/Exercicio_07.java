/*Escreva uma função que receba dois vetores (A[] e B[]) já ordenados em ordem 
 crescente e ambos possuem o mesmo tamanho. A sua função imprime os elementos que
 estão em A[] mas não estão em B[]. Considere que os vetores não contêm valores
 duplicados. A função deve ter deve ter complexidade O(n).
 */
package ADO02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        Arrays.sort(v1);
        exibir(v1);
        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n1);
        Arrays.sort(v2);
        exibir(v2);
        unirVetores(v1,v2);

    }

    public static int leInteiroPositivo() {
        Scanner leitor = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número:");
            n = leitor.nextInt();
        } while (n <= 0 || n > 100);
        return n;
    }

    private static int[] leVetorAleatorio(int n) {
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 50);
        }
        return v;
    }

    private static void exibir(int[] V) {
        System.out.println("Vetor: ");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println("");

    }

    private static void unirVetores(int[] v1, int[] v2) {
        int i =0;
        int j=0;
        while(i< v1.length && j< v2.length){
            if(v1[i] != v2[j]){
                System.out.println(v1[i] + " ");
                i++;
                j++;
            } else {
                if (v1[i]< v2[j]){
                    i++;
                } else{
                    j++;
                }
            }
        }
    }

}
