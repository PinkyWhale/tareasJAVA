
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ejercicio7 {


    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner numeroScan = new Scanner(System.in);
        
        int numero = numeroScan.nextInt();
        
        System.out.println("================================================");
        
        int repeticion = 0;
        
        while(repeticion < 12){
            
            int cuenta = numero * (repeticion+1);
            
            System.out.println( numero + "X" + (repeticion+1) + "=" + cuenta );
            
            repeticion +=1;
        }
    
    }
    
}
