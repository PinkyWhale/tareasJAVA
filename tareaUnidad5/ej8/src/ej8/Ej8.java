
package ej8;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej8 {


    public static void main(String[] args) {
        System.out.println("Ingresar numero de Dispensarios a atender: ");
        Scanner dispensarios = new Scanner(System.in);
        
        int nroDisp;
        nroDisp = dispensarios.nextInt();
        int contador = 0, stock = 1000 ;
        
        while(contador == nroDisp){
            
            System.out.println("Ingresar stock a entregar: ");
            Scanner menosStock = new Scanner (System.in);
            int disStock = menosStock.nextInt();
            stock = stock - disStock;
            
            if(stock <= 200){
                System.out.println("Hay menos de 200 Dosis!");
                if (stock <=0){
                    System.out.println("No hay mas Stock.");
                }
            }
            
            contador = contador +1;
        }
        
    }
    
}
