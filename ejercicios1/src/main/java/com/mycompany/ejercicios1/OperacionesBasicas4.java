/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class OperacionesBasicas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double division = num1 / num2;
        double multiplicacion = num1 * num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La diferencia entre " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("la division de " + num1 + " por " + num2 + " es: " + division);
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicacion);

        scanner.close();
    }
}