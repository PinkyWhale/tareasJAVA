
package ej6;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej6 {


    public static void main(String[] args) {
                
        boolean salida = false;
        
                
        while(salida == false){
            
            System.out.println("Ingrese un numero de 4 cifras: ");
            Scanner ingresoTeclado = new Scanner (System.in); // Entrada por teclado
            
            int numero = ingresoTeclado.nextInt();
            
            int largo = Integer.toString(numero).length();
            
            if (largo >= 4){
                System.out.println("Se ingreso: " + numero);

                String change = Integer.toString(numero);

                String alReves = new StringBuffer(change).reverse().toString();
                
                System.out.println("El nuemro al reves es: " + alReves);
                salida = true;
                
            }
            
        }
        
        
    }
    
}
