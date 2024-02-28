/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class NumeroInvertido14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa un numero de dos digitos: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 99) {
            int unidades = numero % 10;
            int decenas = numero / 10;
            int numeroInvertido = unidades * 10 + decenas;

            System.out.println("El numero invertido es: " + numeroInvertido);
        } else {
            System.out.println("El numero debe tener exactamente dos cifras.");
        }

        scanner.close();
    }
}
