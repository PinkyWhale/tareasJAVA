
package ej5;


import java.util.ArrayList;
import java.util.Collections; // <-- Min y Max
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej5 {


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        
        boolean salida = false;
        
        while(salida == false ){
            System.out.println("Ingrese un numero, Ingrese Cero para terminar: ");
            Scanner a = new Scanner(System.in);
            int val = a.nextInt();
            
            if(val == 0){
                salida = true;
            }else{
                lista.add(val);
            }
        }
        System.out.println("El valor minimo es: ");
        System.out.println(Collections.min(lista));
        System.out.println("El valor Maximo es: ");
        System.out.println(Collections.max(lista));
    }
    
}
