
package ej3;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej3 {

 
    public static void main(String[] args) {
        
        boolean condicion1 = false;
        boolean condicion2 = false;
        boolean condicion3 = false;
        
        int diaReal = 0;
        
        int mesReal=0;
        int anioReal= 0;
       
        
        while(condicion1 == false){
            System.out.println("Ingrese una fecha: ");
            Scanner ingDia = new Scanner(System.in);
        
            int dia = ingDia.nextInt();
        
            if ( dia >= 1 && dia <=31){
                diaReal = dia;
                condicion1 = true;
            }
        }
        
        while( condicion2 == false){
            System.out.println("Ingrese una Mes: ");
            Scanner ingMes = new Scanner(System.in);
        
            int mes = ingMes.nextInt();
        
            if ( mes >= 1 && mes <=12){
                mesReal = mes;
                condicion2 = true;
            }
        }
        
        while( condicion3 == false){
            System.out.println("Ingrese una Año: ");
            Scanner ingAnio = new Scanner(System.in);
        
            int anio = ingAnio.nextInt();
            
            int largo = Integer.toString(anio).length();
        
            if ( largo == 4){
                anioReal = anio;
                condicion3 = true;
            }
            
        System.out.println("La fecha ingresada es: " + diaReal  + "-" + mesReal + "-" + anioReal );
        }
        
        
        
        
        
    }
    
}
