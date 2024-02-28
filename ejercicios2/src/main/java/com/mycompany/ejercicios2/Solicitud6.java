/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Solicitud6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa la nota: ");
        int nota = scanner.nextInt();

        System.out.print("Por favor ingresa la banderae: ");
        int edad = scanner.nextInt();

        System.out.print("Por favor ingrese el género (M/F): ");
        char sexo = scanner.next().charAt(0);

        if (nota < 5 || edad < 18) {
            System.out.println("La solicitud NO SE ACEPTA.");
        } else if (sexo == 'F' && edad >= 18 && nota >= 5) {
            System.out.println("La solicitud es ACEPTADA.");
        } else if (sexo == 'M' && edad >= 18 && nota >= 5) {
            System.out.println("La solicitud es POSIBLE.");
        } else {
            System.out.println("La solicitud NO SE ACEPTA.");
        }

        scanner.close();
    }
}
