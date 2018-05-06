/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author pinky
 */
public class Ej3 {

    public static void main(String[] args) {
        System.out.println("Ingresar 3 numeros: ");
        
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        
        
        int ladoA = a.nextInt();
        int ladoB = b.nextInt();
        int ladoC = c.nextInt();
        
        if ( ladoA == ladoB && ladoA== ladoC ){
            System.out.println("Equilatero");
            } else {
            if ( ladoB != ladoA && ladoB != ladoC && ladoA != ladoC ) {
            System.out.println("Escaleno");
            } else {
            System.out.println("Isosceles");
            }
            }
    }    
}        
         