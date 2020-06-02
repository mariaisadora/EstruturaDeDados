/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Pilha_Fila;

/**
 *
 * @author anacris
 */
public class Batata_Quente {
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        
        q.enqueue("Gabriel");
        q.enqueue("Jeovane");
        q.enqueue("Jonathan");
        q.enqueue("Lucas");
        q.enqueue("Pedro");
        q.enqueue("Raul");
        q.enqueue("Victor");  
        q.enqueue("Victoria");
        q.enqueue("Walter");
        q.enqueue("Wellington");
        System.out.println(q);
        System.out.println("O vencedor é: " + batataQuente(q,3));           
    }

    private static Object batataQuente(Fila q, int k) throws Exception {
        Fila filaTemp = q;
 
        while(filaTemp.size() > 1 ){
            for(int i=0; i<k; i++){
                filaTemp.enqueue(filaTemp.dequeue());
            }
            System.out.println("Saindo: "+ filaTemp.dequeue());
            
        }
        return filaTemp.dequeue(); //Vencedor
    }
}
