/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class PrecioUva10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduce el tipo de uva (A o B): ");
        char tipo = scanner.next().charAt(0);

        System.out.print("Por favor ingrese el tamaño de la uva (1 o 2): ");
        int tamano = scanner.nextInt();

        double precioInicial = 0;
        if (tipo == 'A') {
            if (tamano == 1) {
                precioInicial = 1.2;
            } else if (tamano == 2) {
                precioInicial = 1.5;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioInicial = 1.0;
            } else if (tamano == 2) {
                precioInicial = 1.3;
            }
        }

        double precioVenta = 0;
        if (tipo == 'A') {
            if (tamano == 1) {
                precioVenta = precioInicial + 0.2;
            } else if (tamano == 2) {
                precioVenta = precioInicial + 0.3;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioVenta = precioInicial - 0.3;
            } else if (tamano == 2) {
                precioVenta = precioInicial - 0.5;
            }
        }

        System.out.println("El precio de venta por kilo es: " + precioVenta);

        scanner.close();
    }
}