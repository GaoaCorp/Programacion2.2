/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Division3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: división por cero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        scanner.close();
    }
}
