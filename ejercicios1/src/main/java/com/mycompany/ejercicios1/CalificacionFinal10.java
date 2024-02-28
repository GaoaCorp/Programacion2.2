/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class CalificacionFinal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa la primera nota parcial: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Por favor ingresa la nota del segundo parcial: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Por favor ingresa la nota del tercer parcial: ");
        double calificacion3 = scanner.nextDouble();

        System.out.print("Por favor introduzca la nota del examen final: ");
        double calificacionExamen = scanner.nextDouble();

        System.out.print("Por favor ingrese la calificación final del proyecto: ");
        double calificacionTrabajo = scanner.nextDouble();

        double promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3;
        double porcentajeParciales = 0.55;
        double porcentajeExamen = 0.30;
        double porcentajeTrabajo = 0.15;

        double calificacionFinal = (promedioParciales * porcentajeParciales) + (calificacionExamen * porcentajeExamen) + (calificacionTrabajo * porcentajeTrabajo);

        System.out.println("La nota final es: " + calificacionFinal);

        scanner.close();
    }
}