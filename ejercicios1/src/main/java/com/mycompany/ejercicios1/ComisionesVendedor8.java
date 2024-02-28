/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class ComisionesVendedor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el salario base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Por favor ingresa el número de ventas: ");
        int numSales = scanner.nextInt();

        System.out.print("Por favor ingresa el monto de cada venta: ");
        double[] sales = new double[numSales];
        for (int i = 0; i < numSales; i++) {
            sales[i] = scanner.nextDouble();
        }

        double totalComisiones = 0;
        for (int i = 0; i < numSales; i++) {
            double comision = sales[i] * 0.1;
            totalComisiones += comision;
            System.out.println("Comisión por la venta " + (i+1) + ": $" + comision);
        }

        double sueldoTotal = salarioBase + totalComisiones;

        System.out.println("Comisiones totales: $" + totalComisiones);
        System.out.println("Salario total: $" + sueldoTotal);

        scanner.close();
    }
}