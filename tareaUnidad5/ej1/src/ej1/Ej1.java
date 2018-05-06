
package ej1;

import java.util.Scanner;
/**
 *
 * @author pinky
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner ingresoTeclado = new Scanner (System.in); // Entrada por teclado
        
        int changeNum = ingresoTeclado.nextInt();
        System.out.println(changeNum);
//        if (ingresoTeclado<=1000)
        
        String change = ingresoTeclado.nextLine();
        
        String changeRev = new StringBuffer(change).reverse().toString();
                
        if (change.equals(changeRev)){
            System.out.println(change + "Es capicua.");
            
        }
        
        
        
    }
    
}
