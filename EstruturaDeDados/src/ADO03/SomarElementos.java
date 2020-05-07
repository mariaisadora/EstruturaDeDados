/*
 12) Dada uma sequência de números inteiros positivos, descreva uma função 
 recursiva para encontrar:
 c) A soma dos elementos da sequência
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
public class SomarElementos {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println(somaNumeros(v, 0));

    }

    public static int somaNumeros(int[] v, int n) {
        if (n == v.length) {
            return 0;
        } else {
            return v[n] + somaNumeros(v, n + 1);
        }

    }

}
