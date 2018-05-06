/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean salida = false;
        int I=0, F=0, P=0, A=0, total=0;
        
        
        
        while(salida == false){
            System.out.println("Ingresar I para Ingles, F para Frances, P para Portugues o A para Aleman");
            Scanner a = new Scanner(System.in);
            
            String lenguaje = a.nextLine();
            
            switch (lenguaje.toLowerCase()){
                case "i" : I+=1 ;
                break;
                case "f" : F+=1 ;
                break;
                case "p" : P+=1 ;
                break;
                case "a" : A+=1 ;
                break;
                case "s" : salida = true;
                break;
                default: 
                break;
            }
            
        }
        System.out.println("=======================================");
        total = I + F + P + A;
        System.out.println("El total de Alumnos es de: " + total );
        
        int resultI = total * I ;
        int resultF = total * F ;
        int resultP = total * P ;
        int resultA = total * A ;
        
        System.out.println("El porcentaje de Alumnos de Ingles es: " + resultI + "%");
        System.out.println("El porcentaje de Alumnos de Frances es: "+ resultF + "%");
        System.out.println("El porcentaje de Alumnos de Portugues es: " + resultP + "%");
        System.out.println("El porcentaje de Alumnos de Aleman es: " + resultA + "%");
        
        System.out.println("=======================================");
        System.out.println("HISTOGRAMA:");
        String repeatedI = new String(new char[resultI]).replace("\0","*");
        System.out.println("Ingles: " + repeatedI);
        String repeatedF = new String(new char[resultF]).replace("\0","*");
        System.out.println("France: " + repeatedF);
        String repeatedP = new String(new char[resultP]).replace("\0","*");
        System.out.println("Portug: " + repeatedP);
        String repeatedA = new String(new char[resultA]).replace("\0","*");
        System.out.println("Aleman: " +repeatedA);
    }
    
}
