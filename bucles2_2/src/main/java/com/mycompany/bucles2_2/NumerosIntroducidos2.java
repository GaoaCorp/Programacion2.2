/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class NumerosIntroducidos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de numeros a introducir: ");
        int cantidad = scanner.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;
        int numero;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Numeros mayores que 0: " + mayoresQueCero);
        System.out.println("Numeros menores que 0: " + menoresQueCero);
        System.out.println("Numeros iguales a 0: " + igualesACero);

        scanner.close();
    }
}
