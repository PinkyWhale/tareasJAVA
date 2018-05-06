
package ej7;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej7 {


    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner numeroScan = new Scanner(System.in);
        
        int numero = numeroScan.nextInt();
        
        System.out.println("================================================");
        
        for (int pollo = 0; pollo < 12; pollo++) {
            int cuenta = numero * (pollo+1);
            System.out.println( numero + "X" + (pollo+1) + "=" + cuenta );
        }
    }
    
}
