/* Escreva uma função que recebe um vetor V de n números inteiros, um elemento 
 chave x e uma posição e insere o elemento na posição dada no vetor. 
 */
package ADO01;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.print("Digite o valor do elemento: ");
        int x = leitor.nextInt();
        System.out.print("Digite a posição: ");
        int posicao = leitor.nextInt();
        inserirElemento(v, posicao, x, n);
        exibeVetor(v);
    }

    public static int inserirElemento(int[] v, int posicao, int x, int n) {
        for (int i = 0; i >= posicao; i--) {
            v[i] = v[i - 1];
            v[posicao] = x;

        }
        return n + 1;

    }

}
