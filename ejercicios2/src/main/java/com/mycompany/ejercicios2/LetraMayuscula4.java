/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class LetraMayuscula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduce un caracter: ");
        String caracter = scanner.next();

        if (caracter.length() != 1) {
            System.out.println("Error: introduzca solo un caracter.");
        } else if (caracter.charAt(0) >= 'A' && caracter.charAt(0) <= 'Z') {
            System.out.println("El caracter es una letra mayuscula.");
        } else {
            System.out.println("El caracter no es una letra mayuscula.");
        }

        scanner.close();
    }
}