/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array2_3;

import java.util.Scanner;

public class ArraySums3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[4][5];
        int[] sumasFilas = new int[4];
        int[] sumasColumnas = new int[5];
        int sumaTotal = 0;

        System.out.println("Introduce 20 numeros enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Numero " + (i * 5 + j + 1) + ": ");
                numeros[i][j] = scanner.nextInt();
                sumasFilas[i] += numeros[i][j];
                sumasColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("\nSuma parcial de filas y columnas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("= " + sumasFilas[i]);
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(" " + sumasColumnas[j]);
        }
        System.out.println("\nSuma total: " + sumaTotal);

        scanner.close();
    }
}