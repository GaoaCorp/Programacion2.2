/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Circulos7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las coordenadas del centro del primer circulo (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Introduzca el radio del primer circulo (r1): ");
        double r1 = scanner.nextDouble();

        System.out.print("Ingrese las coordenadas del centro del segundo circulo (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Introduzca el radio del segundo circulo (r2): ");
        double r2 = scanner.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (d > r1 + r2) {
            System.out.println("Los circulos son EXTERIORES..");
        } else if (d == r1 + r2) {
            System.out.println("Los circulos son TANGENTES EXTERIORES..");
        } else if (r1 > d && d > Math.abs(r1 - r2)) {
            System.out.println("Los circulos son SECANTES..");
        } else if (d == Math.abs(r1 - r2)) {
            System.out.println("Los circulos son TANGENTES INTERIORES..");
        } else if (d < Math.abs(r1 - r2)) {
            System.out.println("Los circulos son INTERIORES..");
        } else if (d == 0 && r1 == r2) {
            System.out.println("Los circulos son CONCENTRICOS.");
        } else {
            System.out.println("Error: datos no validos.");
        }

        scanner.close();
    }
}
