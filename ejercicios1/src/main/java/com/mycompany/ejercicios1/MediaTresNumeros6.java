/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class MediaTresNumeros6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Por favor ingresa el tercer numero: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("El promedio de " + num1 + ", " + num2 + " y " + num3 + " es: " + media);

        scanner.close();
    }
}