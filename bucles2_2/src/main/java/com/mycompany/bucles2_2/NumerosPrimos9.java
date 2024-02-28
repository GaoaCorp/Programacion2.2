/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class NumerosPrimos9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de numeros primos que quieres mostrar: ");
        int n = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        System.out.println("Los " + n + " primeros numeros primos son:");
        while (contador < n) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }

        System.out.println();

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}