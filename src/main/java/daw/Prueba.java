/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author pablo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        numeroAleatorioEntreDosRangos();
     
        
        
        
        
    }
    
    
     public static int numeroAleatorioEntreDosRangos(){
        Random enteroAleatorio=new Random();
        int numero=0;
        int minimo = 10, maximo = 20;
        
        numero = enteroAleatorio.nextInt(minimo - maximo + 1) + numero;
        System.out.println("Entero aleatorio entre " +minimo +" y " +maximo+ " === " + numero);

       
        return numero;
       
       
       
       
   }
    
}
