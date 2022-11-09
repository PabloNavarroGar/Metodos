/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int min = 0;
        int max = 0;
        //se pone dentro del blobuqe try la sentencia que puede producir 
        //el error
        do {
            System.out.println(" Introduce el numero entero:");

            try {

                numero = flujo.nextInt();
                System.out.println("El numero  es: " + numero);
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No se puede leer el numero");
                // Limpieza del buffer
                flujo.nextLine();

            }
        } while (comprobarRango(numero, min, max));

        return numero;
    }

    //Metodo generar aleatorio dentro del rango
    public static int numeroAleatorioRango() {

        Random random = new Random();
        
        int enteroAleatorio = random.nextInt();
        int min=0;
        int max=0;
        do{
            
        System.out.println("Entero aleatorio: " + enteroAleatorio);
        }while(comprobarRango(enteroAleatorio, min, max));
        
        
        return enteroAleatorio;
    }

    //OPERADOR TERNARIO
//     Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Introduce tu edad:");
//
//        int edad = scanner.nextInt();
//
//        /* if (edad >= 18) {
//                        System.out.println("Es mayor de edad");
//                } else {
//                        System.out.println("No es mayor de edad");
//                }
//
//                System.out.print("mostrar la edad: ");
//                System.out.println(edad);
//                
//         */
//        //Pasamos el ejercicio con Operandos ?:
//        // Los operadores ternarios se declara en la condicion entre parentesis el ?
//        //equivale a algo junto a las comillas con 2 posibles resultados, izquierda true, y falso derecha
//        String resultado;
//        resultado = (edad >= 18) ? " Eres mayor de edad" : " Eres menor de Edad";
//
//        System.out.println(resultado);
//    
    
       // Métodos para mostrar códigos de productos
    // y filtrarlos hasta que sean correctos
    public static String pedirCodigoProducto() {
        String codigo;
        do {
            codigo = mostrarMenuCodigos();
        } while (!esCodigoProductoValido(codigo));
        return codigo;
    }

    public static boolean esCodigoProductoValido(String codigo) {
//        if(codigo.equalsIgnoreCase("m1")||codigo.equalsIgnoreCase("p1")
//                || codigo.equalsIgnoreCase("t1")){
//            return true;
//        }
//        else{
//            return false;
//        }
        return (codigo.equalsIgnoreCase("m1") ||
                codigo.equalsIgnoreCase("p1") ||
                codigo.equalsIgnoreCase("t1") ||
                codigo.equalsIgnoreCase("salir"));
    }

    public static String mostrarMenuCodigos() {
        String texto = """
                       Introduce el código del producto:
                        M1 - Matecados
                        T1 - Turrón de chocolate
                        P1 - Polvorones
                        T2 - Turron Clasico
                        P1 - Mazapanes
                        Salir- Sales del progama
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }

    // Métodos para mostrar opciones generales del programa para entrar al otro menu, 
    //mirar el ejercicio modular de la fabrica de dulces.
    // y filtrarlas hasta que sean correctas
    public static boolean esOpcionMenuInicialValida(String opcion) {
//        if (opcion.equalsIgnoreCase("salir") || opcion.equalsIgnoreCase("calcular")){
//            return true;
//        }
//        else{
//            return false;
//        }
        return opcion.equalsIgnoreCase("salir") || opcion.equalsIgnoreCase("calcular");
    }

    public static String mostrarMenu() {
        String texto = """
                        Escribe calcular para calcular
                        Escribe salir para terminar
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }

    public static String pedirOpcion() {
        //Todo metodo tiene que ir con parametros y con el return
        String opcion;
        do {
            opcion = mostrarMenu();
        } while (!esOpcionMenuInicialValida(opcion));
        return opcion;
    }
    
    
       //Solicitar materia prima
    public static double soliticarNumero() {

        double numero = 0;

        //Bucle que se le introduce el numero
        do {
            try {
                String ejemploString = JOptionPane.showInputDialog("Introduce el numero,"
                        + "se compara con entre 0.1 y 1, puedes cambiarlo segun te pida");
                //Parse del string a double

                numero = Double.parseDouble(ejemploString);
                //Salida de datos
                JOptionPane.showMessageDialog(null, "el numero esta dentro del rango " + numero);
                //El catch usado cuando se piede por JOptionPane
            } catch (NumberFormatException ime) {

                JOptionPane.showMessageDialog(null, "Error dato no permitido");

            }
            //! y lo que este entre los parentesis  significa
            //que todo lo que no se haga en el parentesis , se repetira

            //lee el metodo de filtrado, pasa al metodo de filtrado para comprobarlo
            //cuando pide CosteMateria: se le pone costeMateriaPrima que es un double
        } while (!filtradoNumero(numero));
        return numero;
    }
    //numero Que Pide El Double Del Solicitar 
    public static boolean filtradoNumero(double numero2) {
        //en el filtrado solo hacemos el return para que compare
        return (numero2 >= 0.1 && numero2<= 1.0);
    
    }
    
     public static double sumaDeDosDatos(double dato1, double dato2, String codigoDato) {

        double sumadeDosDatos;
        sumadeDosDatos = dato1 + dato2;

        JOptionPane.showMessageDialog(null, "El numero  de producción del código " 
                + codigoDato + " es: "
                
                + String.format("%.2f",  sumadeDosDatos) + "€");

        return  sumadeDosDatos;
    }
    
    
    
    
    //INTRODUCIR UN NUMERO POR CONSOLA 
     public static double importeCompra() {
        Scanner teclado = new Scanner(System.in);
        double importe = 0;
        boolean repetir = true;
        do{
        try {
            System.out.println("Introduzca el importe de su compra por favor");

            importe = teclado.nextDouble();

            System.out.println(" El importe de tu compra es de  " + importe);
            repetir = false;
        } catch (InputMismatchException ime) {
            System.out.println("Dato Invalido,vuelva a introducirlo");
            teclado.nextLine();
        }
        }while(repetir);
        return importe;
    }
    
    
    
      //Formula para que un foat se mezcle con un double y se puedan operar, salio en el ejercicio de la practiquilla
        //reparacionesMartes = (float) (REPARACIONES * numeroReparacionesDelDia);
    
    
    public static int pedirNumeroUsuarioSinErrores() {
        //Pedimos un entero al usuario 
        int numeroUsuario=0;
        do {
           
            try {
                String numero = JOptionPane.showInputDialog("Introduce un numero del 1 al 10: ");
                numeroUsuario = Integer.parseInt(numero);
                JOptionPane.showMessageDialog(null, "El numero "
                        + "que has escogido es el: " + numero);
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has "
                        + "introducido un número entero.");
            }
        } while (numeroUsuario < 1 || numeroUsuario > 10);

        return numeroUsuario;
    
    
    }
    
    
    public static int generarNumeroAleatorio() {
        //Clase random para , gracias samuel
        Random numeroAleatorio = new Random();
        //El int de la maquina se iguala al numero random con un next Int para que sea int
        //y 10 y fuera del parentesiss +1 para que pille los 10, si no seria hasta 9
        int maquina = numeroAleatorio.nextInt(10) + 1;
        JOptionPane.showMessageDialog(null, "La maquina a escogido el numero : " + maquina);
        return maquina;
    }
    
   public static int randomEntreDosNumeros(){
        Random random =new Random();
         int enteroAleatorio;
        int n = 10, m = 20;
        enteroAleatorio = random.nextInt(m - n + 1) + n;
        System.out.println("Entero aleatorio (n-m): " + enteroAleatorio);
        return enteroAleatorio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
