/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class DistanciaEntrePuntos12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduce las coordenadas del primer punto. (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Por favor introduce las coordenadas del segundo punto. (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        double distancia = Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);

        System.out.println("La distancia entre los puntos. (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);

        scanner.close();
    }
}
