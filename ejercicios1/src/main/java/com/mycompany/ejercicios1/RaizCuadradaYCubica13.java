/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class RaizCuadradaYCubica13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.pow(numero, 1.0/3.0);

        System.out.println("La raiz cuadrada de" + numero + " es: " + raizCuadrada);
        System.out.println("La raiz cubica de " + numero + " es: " + raizCubica);

        scanner.close();
    }
}
