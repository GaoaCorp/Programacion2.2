/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array2_3;

import java.util.Scanner;

public class ArrayMaxMin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("Numeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + ": " + numeros[i] + (numeros[i] == maximo ? " (maximo)" : (numeros[i] == minimo ? " (minimo)" : "")));
        }

        scanner.close();
    }
}