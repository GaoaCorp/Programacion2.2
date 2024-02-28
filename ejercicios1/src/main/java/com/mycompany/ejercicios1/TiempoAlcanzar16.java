/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class TiempoAlcanzar16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduzca la distancia entre los dos vehiculos (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Por favor introduzca la velocidad del primer vehiculo (km/h): ");
        double velocidad1 = scanner.nextDouble();

        System.out.print("Por favor introduzca la velocidad del segundo vehiculo (km/h): ");
        double velocidad2 = scanner.nextDouble();

        double tiempoAlcanzar = distancia / (velocidad2 - velocidad1) * 60;

        System.out.println("El primer vehículo tomara " + tiempoAlcanzar + " minutos para llegar al segundo vehiculo.");

        scanner.close();
    }
}