/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class ViajeEstudios11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero de estudiantes: ");
        int numAlumnos = scanner.nextInt();

        double costoAlumno = 0;
        double pagoAutobus = 0;
        if (numAlumnos >= 100) {
            costoAlumno = 65;
            pagoAutobus = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 50) {
            costoAlumno = 70;
            pagoAutobus = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 30) {
            costoAlumno = 95;
            pagoAutobus = numAlumnos * costoAlumno;
        } else {
            pagoAutobus = 4000;
            costoAlumno = pagoAutobus / numAlumnos;
        }

        System.out.println("El costo por estudiante es: " + costoAlumno + " euros.");
        System.out.println("El pago a la compañia de autobuses es: " + pagoAutobus + " euros.");

        scanner.close();
    }
}