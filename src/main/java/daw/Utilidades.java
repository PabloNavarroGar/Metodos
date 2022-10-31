/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Utilidades {

    private static Scanner flujo = new Scanner(System.in);

       //metodd para comprobar dado un numero si entre 2
    public static boolean comprobarRango(int numero, int min, int max) {
        boolean resultado = false;
        
        if (numero >= min && numero <= max) {
            resultado = true;
        }

        return resultado;

    }

    //Metodo para introducir numeros enteros

    public static int leerEnterosSinErrores() {

        int numero = 0;

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            System.out.println("Introduce el número entero ");
            try {
                numero = flujo.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                flujo.nextLine();
            }
        } while (true);
        return numero;
        
   
    }

    
    
    
    public static int leerEnteroRango() {
        
        int numero = 0;
        //declaracion de los min y los max
        int min=0;
        int max=0;
        //se pone dentro del blobuqe try la sentencia que puede producir 
        //el error
        do{
            System.out.println(" Introduce el numero entero:");
            
            try{
                
                numero = flujo.nextInt();
                System.out.println("El numero  es: " + numero);
            }catch(InputMismatchException ime){
                // En caso de error
                System.out.println("No se puede leer el numero");
                // Limpieza del buffer
                flujo.nextLine();
                
                
            }
        }while(comprobarRango(numero,min,max));
        
        return numero;
    }
    
    
    //Metodo generar aleatorio dentro del rango
    
    //public static int numeroAleatorioRango(){
        
        
        
        
        
        
        
        
    //}
    
    
    
    
    
    
    
    
    
    
}
