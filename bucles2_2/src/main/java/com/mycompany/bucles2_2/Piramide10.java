/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class Piramide10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de filas de la piramide: ");
        int n = scanner.nextInt();

        for (int fila = 1; fila <= n; fila++) {
            for (int espacios = n - fila; espacios > 0; espacios--) {
                System.out.print(" ");
            }
            for (int columna = 1; columna <= fila * 2 - 1; columna++) {
                System.out.print(columna);
            }
            System.out.println();
        }

        scanner.close();
    }
}