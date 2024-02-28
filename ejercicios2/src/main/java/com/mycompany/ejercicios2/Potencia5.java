/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Potencia5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero base: ");
        double base = scanner.nextDouble();

        System.out.print("Por favor ingrese el exponente: ");
        int exponente = scanner.nextInt();

        if (exponente > 0) {
            double resultado = Math.pow(base, exponente);
            System.out.println("El resultado es: " + resultado);
        } else if (exponente == 0) {
            System.out.println("El resultado es: 1");
        } else {
            double resultado = 1 / Math.pow(base, -exponente);
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}