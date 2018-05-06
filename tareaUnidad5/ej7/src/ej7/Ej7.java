
package ej7;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej7 {

   
    public static void main(String[] args) {
        System.out.println("Ingresar un numero de 1 al 7 // Cero para termianr el programa: ");
        
        boolean salida = false;
        
        while(salida == false){
            Scanner ingreso = new Scanner(System.in);
            
            int numero = ingreso.nextInt();
            
            switch(numero){
                case 0 : salida = true;
                break;
                case 1 : System.out.println("Azul");
                break;
                case 2 : System.out.println("Rojo");
                break;
                case 3 : System.out.println("Amarillo");
                break;
                case 4 : System.out.println("Verde");
                break;
                case 5 : System.out.println("Violeta");
                break;
                case 6 : System.out.println("Blanco");
                break;
                case 7 : System.out.println("Negro");
                break;
                default : System.out.println("Error vuelva a ingresar un numero: ");
                break;
                
            }
        }
    }
    
}
