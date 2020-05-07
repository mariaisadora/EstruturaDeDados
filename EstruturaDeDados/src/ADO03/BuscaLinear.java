/*12) Dada uma sequência de números inteiros positivos, descreva uma função
 recursiva para encontrar:
 a) Busca linear de um elemento da sequência;
 Considere que as sequência informada para as funções não é vazia, ou seja, 
 se n >= 1.
 */
package ADO03;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class BuscaLinear {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.println("Posição: " + buscaLinear(n1, v, 0));

    }

    public static int buscaLinear(int n1, int[] v, int i) {
        if (i == v.length - 1) {
            return -1;
        }

        if (n1 == v[0]) {
            return i;
        }
        return buscaLinear(n1, v, i + 1);
    }

}
