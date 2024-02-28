/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;

public class Hipotenusa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduzca la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Por favor introduzca la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

        scanner.close();
    }
}
