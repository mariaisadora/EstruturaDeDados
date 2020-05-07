/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_05_Recursao.Ex_07_Primo.ehPrimoIt;
import static Aula_05_Recursao.Ex_07_Primo.ehPrimoR;

/**
 *
 * @author anacris
 */
public class Ex_10_11_Conv_DecBin_BinDec {
    public static void main(String[] args) {
        
        System.out.println("Conversão de Decimal para Binário");
        int decimal=leInteiroPositivo();
        System.out.println("Versão iterativa: ");
        System.out.println(dec2BinIt(decimal));
        System.out.println("Versão recursiva: ");
        System.out.println(dec2BinR(decimal)); 
        
        System.out.println("Conversão de Binário para Decimal");
        int binario=leInteiroPositivo();
        System.out.println("Versão iterativa: ");
        System.out.println(bin2DecIt(binario));
        System.out.println("Versão recursiva: ");
        System.out.println(bin2DecR(binario));
    }

    public static int dec2BinIt(int decimal) {
        int binario=0;
        int cont=0;
        
        while (decimal>0){
            int resto=decimal%2;
            binario += resto*Math.pow(10.0,cont);
            decimal=decimal/2; //atualização
            cont++; //atualização  
        }
        return binario;
    }
    
    public static int dec2BinR(int decimal) {
        if (decimal<2)
            return decimal;
 
        return 10*dec2BinR(decimal/2)+ decimal%2;
    }
    public static int bin2DecIt(int binario) {
        int decimal=0;
        int cont=0;
        
        while (binario>0){
            int resto=binario%10;
            decimal += resto*Math.pow(2.0,cont);
            binario=binario/10; //atualização
            cont++; //atualização  
        }
        return decimal;
    }
    
    public static int bin2DecR(int binario) {
        if (binario<10)
            return binario;
 
        return 2*bin2DecR(binario/10)+ binario%10;
    }
}
