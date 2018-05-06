
package ej5;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej5 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un Nombre");
        Scanner nombre = new Scanner(System.in);
        
        String dato = nombre.nextLine();
        
        System.out.println("El nombre es Mayusculas es: ");
        System.out.println(dato.toUpperCase());
        
        int largo = dato.length();
        
        System.out.println("El largo de la palabra es: "+ largo );
    }
    
}
