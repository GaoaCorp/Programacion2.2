/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array2_3;

import java.util.Scanner;

public class ArrayInverso1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Numeros en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
