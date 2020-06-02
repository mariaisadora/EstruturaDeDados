package Trabalho02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class testaFreqPalavra {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FreqPalavra arvoreB = new FreqPalavra();
        String[] stringPalavra;

        try {
            // abre o arquivo
            FileReader arquivo = new FileReader("texto.txt");
            // prepara para fazer a leitura por linha dos caracteres
            BufferedReader leBufferizado = new BufferedReader(arquivo);
            // le uma linha do arquivo e armazena em uma String
            String linha = leBufferizado.readLine();
            System.out.println("Texto: " + linha);
            //separa as palvras
            stringPalavra = linha.split(" ");
            //andar na linha e inserir a palavra na arvore
            for (String palavra : stringPalavra) {
                if (palavra.equals("")) {
                } else {
                    arvoreB.insere(palavra);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro na abertura do arquivo");
            e.getMessage();
        }

        //Print Árvore
        System.out.print("Pré-ordem: ");
        arvoreB.preOrdem();
        System.out.println();
        System.out.print("In-ordem: ");
        arvoreB.inOrdem();
        System.out.println();
        System.out.print("Pós-ordem: ");
        arvoreB.posOrdem();
        System.out.println();

    }
}
