/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class DescuentoTienda9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el monto total de la compra: ");
        double totalPurchase = scanner.nextDouble();

        double descuento = totalPurchase * 0.15;
        double precioFinal = totalPurchase - descuento;

        System.out.println("El precio final de la compra con un 15% de descuento es: $" + precioFinal);

        scanner.close();
    }
}