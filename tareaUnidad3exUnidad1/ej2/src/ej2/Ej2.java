
package ej2;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej2 {

    public static String accionCapital (String dato){
      char[] conjunto  = dato.toCharArray(); // Convierte String en Array
      conjunto[0] = Character.toUpperCase(conjunto[0]); // Se modifica el primer elemento del array
      return new String(conjunto); // devuelve el nuevo valor
    }
    
    public static void main(String[] args) {
        System.out.println("Ingresar un Nombre: ");
        Scanner ingNombre = new Scanner(System.in);
        
        String datoNomb = ingNombre.nextLine();
        System.out.println(accionCapital(datoNomb));
        
        System.out.println("Ingresar un Apellido: ");
        Scanner ingApell = new Scanner(System.in);
          
        String datoApell = ingApell.nextLine();
        System.out.println(accionCapital(datoApell));
    }
    
}
