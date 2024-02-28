/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class Intervalo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limiteInferior, limiteSuperior, numero, suma = 0, fueraIntervalo = 0, igualesAlIntervalo = 0;

        do {
            System.out.print("Introduce el limite inferior: ");
            limiteInferior = scanner.nextInt();

            System.out.print("Introduce el limite superior: ");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior > limiteSuperior) {
                System.out.println("El limite inferior debe ser menor o igual al limite superior.");
            }
        } while (limiteInferior > limiteSuperior);

        do {
            System.out.print("Introduce un numero: ");
            numero = scanner.nextInt();

            if (numero >= limiteInferior && numero < limiteSuperior) {
                suma += numero;
            } else if (numero == limiteInferior || numero == limiteSuperior) {
                igualesAlIntervalo++;
            } else if (numero < limiteInferior) {
                fueraIntervalo++;
            } else {
                fueraIntervalo++;
            }

        } while (numero != 0);

        System.out.println("La suma de los numeros dentro del intervalo es: " + suma);
        System.out.println("La cantidad de numeros fuera del intervalo es: " + fueraIntervalo);
        System.out.println("La cantidad de numeros iguales a los limites del intervalo es: " + igualesAlIntervalo);

        scanner.close();
    }
}