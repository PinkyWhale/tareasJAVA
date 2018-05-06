
package ej2;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej2 {


    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);

        
        int numero, perimetro;
        System.out.println("Ingrese el area de m²:  ");
        numero = entradaDatos.nextInt();
        int resultado = (int) Math.sqrt(numero);
        System.out.println("La raiz cuadrada de "+ numero +  " es: " + resultado);
        
        perimetro = resultado * 4;
        System.out.println("El perimetro del cuadrado es " + perimetro);
    
    }
    
}
