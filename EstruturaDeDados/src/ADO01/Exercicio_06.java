/*Escreva uma função que recebe um vetor V de n números inteiros e um elemento
 chave x e remove o elemento dado no vetor, caso ele exista no vetor.
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
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.print("Digite o valor que vai ser removido: ");
        int x = leitor.nextInt();
        removerElemento(v, x);
    }

    public static void removerElemento(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {

            if (v[i] != x) {
                System.out.println(v[i] + " ");
            }
        }
        System.out.println("");

    }

}
