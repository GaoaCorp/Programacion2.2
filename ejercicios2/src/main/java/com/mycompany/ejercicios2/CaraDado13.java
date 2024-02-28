/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class CaraDado13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el resultado obtenido al lanzar un dado de seis caras.: ");
        int resultado = scanner.nextInt();

        String caraOpuesta = "";
        if (resultado < 1 || resultado > 6) {
            caraOpuesta = "ERROR: el número es incorrecto.";
        } else if (resultado == 1) {
            caraOpuesta = "6";
        } else if (resultado == 2) {
            caraOpuesta = "5";
        } else if (resultado == 3) {
            caraOpuesta = "4";
        } else if (resultado == 4) {
            caraOpuesta = "3";
        } else if (resultado == 5) {
            caraOpuesta = "2";
        } else if (resultado == 6) {
            caraOpuesta = "1";
        }

        System.out.println("La cara opuesta es: " + caraOpuesta);

        scanner.close();
    }
}