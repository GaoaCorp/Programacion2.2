/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class IntercambiarValores15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Por favor ingrese el valor de B: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("El valor de A ahora es: " + a);
        System.out.println("El valor de B ahora es: " + b);

        scanner.close();
    }
}