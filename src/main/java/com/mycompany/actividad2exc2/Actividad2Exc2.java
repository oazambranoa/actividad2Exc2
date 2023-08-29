/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc2;

/**
 *
 * @author oazambranoa
 */

/*

Enunciado:

19. Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo.

*/

import java.util.Scanner;

public class Actividad2Exc2 {

    public static void main(String[] args) {
        double lenghtSide, tArea, tPeri, tHeight;
        
        System.out.println("Ingrese el valor del lado del triangulo equilatero");
        Scanner valorLado = new Scanner(System.in);
        lenghtSide = valorLado.nextDouble();
        
        tArea = (Math.sqrt(3) / 4) * (Math.pow(lenghtSide, 2));
        tPeri = 3 * lenghtSide;
        tHeight = (Math.sqrt(3) / 2) * lenghtSide;
        
        System.out.println("El perimetro del triangulo equilatero es: " + tPeri);
        System.out.println("La altura del triangulo equilatero es: " + tHeight);
        System.out.println("El area del triangulo equilatero es: " + tArea);
    }
}
