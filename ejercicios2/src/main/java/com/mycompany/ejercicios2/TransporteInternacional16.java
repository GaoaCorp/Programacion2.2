/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class TransporteInternacional16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el peso del paquete en kilogramos.: ");
        double peso = scanner.nextDouble();

        System.out.print("Por favor ingrese la zona a la que va dirigido el paquete (1=America del Norte, 2=America Central, 3=America del Sur, 4=Europa, 5=Asia): ");
        int zona = scanner.nextInt();

        double costo = 0;
        if (peso > 5) {
            costo = -1;
        } else if (zona == 1) {
            costo = 24 * peso;
        } else if (zona == 2) {
            costo = 20 * peso;
        } else if (zona == 3) {
            costo = 21 * peso;
        } else if (zona == 4) {
            costo = 10 * peso;
        } else if (zona == 5) {
            costo = 18 * peso;
        }

        System.out.println("El costo del envio es: " + costo + " euros.");

        scanner.close();
    }
}