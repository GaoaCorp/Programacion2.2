/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Llamada12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese la duración de la llamada en minutos: ");
        int duracion = scanner.nextInt();

        double costo = 0;
        if (duracion <= 5) {
            costo = 1;
        } else if (duracion <= 8) {
            costo = 1 + (duracion - 5) * 0.08;
        } else if (duracion <= 10) {
            costo = 1 + 3 * 0.08 + (duracion - 8) * 0.07;
        } else {
            costo = 1 + 3 * 0.08 + 2 * 0.07 + (duracion - 10) * 0.05;
        }

        double impuesto = 0;
        System.out.print("Introduzca el dia de la semana (0=domingo, 1=lunes, ..., 6=sabado): ");
        int diaSemana = scanner.nextInt();
        if (diaSemana == 0) {
            impuesto = costo * 0.03;
        } else if (diaSemana < 5) {
            impuesto = costo * 0.15;
        } else {
            impuesto = costo * 0.10;
        }

        System.out.println("El costo de la llamada es: " + (costo + impuesto) + " euros.");

        scanner.close();
    }
}
