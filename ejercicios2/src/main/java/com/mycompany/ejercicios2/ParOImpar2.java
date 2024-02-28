/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class ParOImpar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es par.");
        } else {
            System.out.println("el numero es impar.");
        }

        scanner.close();
    }
}
