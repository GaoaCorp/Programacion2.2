/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class MayorOIgual1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Los dos numeros son iguales.");
        }

        scanner.close();
    }
}