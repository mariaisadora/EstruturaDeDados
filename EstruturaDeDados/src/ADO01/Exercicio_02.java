/*Escreva uma função que recebe por parâmetro um vetor de números inteiros e 
 retorna o índice em que se encontra o maior elemento do vetor.
 */
package ADO01;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Indice do maior elemento do vetor: " + indiceMaior(v));
    }

    public static int indiceMaior(int[] v) {
        int indice = 0;
        int maior = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                indice = i;
            }
        }

        return indice;

    }

}
