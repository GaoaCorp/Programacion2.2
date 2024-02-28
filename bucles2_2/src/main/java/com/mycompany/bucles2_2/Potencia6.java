/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class Potencia6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println("El resultado de la potencia es: " + potencia);

        scanner.close();
    }
}
