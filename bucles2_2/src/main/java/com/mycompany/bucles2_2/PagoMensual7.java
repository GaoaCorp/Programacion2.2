/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class PagoMensual7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor del producto: ");
        double valorProducto = scanner.nextDouble();

        System.out.print("Introduce el plazo en meses: ");
        int plazo = scanner.nextInt();

        double pagoMensual = 0;
        double totalPagado = 0;

        for (int i = 1; i <= plazo; i++) {
            if (i == 1) {
                pagoMensual = valorProducto / plazo;
            }
            totalPagado += pagoMensual;
            System.out.println("En el mes " + i + " debe pagar: " + pagoMensual);
        }

        System.out.println("El total pagado despues de " + plazo + " meses es: " + totalPagado);

        scanner.close();
    }
}
