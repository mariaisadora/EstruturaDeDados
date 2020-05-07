/*12) Dada uma sequência de números inteiros positivos, descreva uma função
 recursiva para encontrar:
 b) Menor elemento da sequência;
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
public class MenorElemento {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println(menorNumero(v, v.length - 1));

    }

    public static int menorNumero(int v[], int n) {

        if (n == 0) {
            return v[0];
        }

        int n1 = menorNumero(v, n - 1);

        if (n1 < v[n - 1]) {
            return n1;
        } else {
            return v[n - 1];
        }

    }
}
