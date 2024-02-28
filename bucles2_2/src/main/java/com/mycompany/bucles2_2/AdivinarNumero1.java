/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAAdivinar = random.nextInt(100) + 1;
        int intentos = 10;
        int numeroIntroducido;

        System.out.println("Adivina el numero entre 1 y 100.");

        while (intentos > 0) {
            System.out.print("Introduce un numero: ");
            numeroIntroducido = scanner.nextInt();

            if (numeroIntroducido == numeroAAdivinar) {
                System.out.println("¡Felicidades! Has acertado el numero en " + (10 - intentos) + " intentos.");
                break;
            } else if (numeroIntroducido > numeroAAdivinar) {
                System.out.println("El numero es menor.");
            } else {
                System.out.println("El numero es mayor.");
            }

            intentos--;
        }

        if (intentos == 0) {
            System.out.println("Lo siento, se te han agotado los intentos. El numero era " + numeroAAdivinar + ".");
        }

        scanner.close();
    }
}