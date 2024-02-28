/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class AnioBisiesto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese un año: ");
        int anio = scanner.nextInt();

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    System.out.println("El año es bisiesto.");
                } else {
                    System.out.println("El año no es bisiesto.");
                }
            } else {
                System.out.println("El año es bisiesto.");
            }
        } else {
            System.out.println("El año no es bisiesto.");
        }

        scanner.close();
    }
}