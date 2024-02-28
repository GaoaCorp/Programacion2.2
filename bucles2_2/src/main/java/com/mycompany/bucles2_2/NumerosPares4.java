/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class NumerosPares4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Numeros pares entre " + numero1 + " y " + numero2 + ": ");

        if (numero1 > numero2) {
            int temporal = numero1;
            numero1 = numero2;
            numero2 = temporal;
        }

        for (int i = numero1 + 1; i < numero2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
