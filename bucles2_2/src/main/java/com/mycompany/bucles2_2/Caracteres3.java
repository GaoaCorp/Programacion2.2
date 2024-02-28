/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class Caracteres3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce caracteres (para terminar introduce un espacio): ");
        char caracter;

        do {
            caracter = scanner.next().charAt(0);

            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("VOCAL");
            } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        } while (caracter != ' ');

        scanner.close();
    }
}
