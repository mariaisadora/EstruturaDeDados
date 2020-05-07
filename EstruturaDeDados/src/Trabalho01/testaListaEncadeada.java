/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Maria Isadora Marba Beserra
 */
public class testaListaEncadeada {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("#Arquivo descompactado#");
        try {
            // abre o arquivo
            FileReader arquivo = new FileReader("texto.txt");
            // prepara para fazer a leitura por linha dos caracteres
            BufferedReader leBufferizado = new BufferedReader(arquivo);
            // le uma linha do arquivo e armazena em uma String
            String linha = leBufferizado.readLine();
            while (linha != null) {
                System.out.println(linha);
                String arqStr[] = linha.split(" ");
                linha = leBufferizado.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro na abertura do arquivo");
            e.getMessage();
        }
        System.out.println("#Arquivo compactado#");
        ListaEncadeada lista = new ListaEncadeada();
        //lista.insereInicio();
        
        String[] ler = lerArquivo();
        for(int i = 0; i < ler.length; i++){
            System.out.print(" " + ler[i]);
        }
        lista.compactador(ler);
        System.out.println(lista);
        

    }
    /*public static ListaEncadeada carregarArquivo(String arquivoC) throws FileNotFoundException, IOException{
        String str;
        String listaL[];
        
         BufferedReader leBufferizado = new BufferedReader(new FileReader(arquivoC));
         str = leBufferizado.readLine();
         listaL = str.split(" ");
         ListaEncadeada listaAux = new ListaEncadeada();
         return listaAux;
    }*/
    
    public static String[] lerArquivo() throws FileNotFoundException, IOException{
        // abre o arquivo
        FileReader arquivo = new FileReader("texto.txt");
        // prepara para fazer a leitura por linha dos caracteres
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        // le uma linha do arquivo e armazena em uma String
        String linha = leBufferizado.readLine();
        String arquivoC[] = linha.split(" ");
            return arquivoC;
    }

}
