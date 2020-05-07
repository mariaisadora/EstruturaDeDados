/*12) Dada uma sequência de números inteiros positivos, descreva uma função
 recursiva para encontrar
 d) A média aritmética dos elementos da sequência
 Considere que as sequência informada para as funções não é vazia,
 ou seja, se n >= 1.
 */
package ADO03;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class Media {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println(mediaAritmetica(v, v.length));

    }

    public static double mediaAritmetica(int[] v, int n) {
        if (n == v.length) {
            return 0;
        }

        double soma = v[n] + mediaAritmetica(v, n - 1);

        if (n == 0) {
            return soma / v.length;

        } else {
            return soma;
        }

    }

}
