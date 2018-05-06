
package ej1;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej1 {

    
    public static void main(String[] args) {
        System.out.println("Ingresar un nombre: ");
        Scanner ingreso = new Scanner(System.in);
        
        String dato = ingreso.nextLine();
        
        System.out.println("El nombre es Mayusculas es: ");
        System.out.println(dato.toUpperCase());
        
        }
    
}
