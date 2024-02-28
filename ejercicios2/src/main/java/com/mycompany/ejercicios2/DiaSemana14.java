/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class DiaSemana14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un dia de la semana (1=lunes, 2=martes, ..., 7=domingo): ");
        int diaSemana = scanner.nextInt();

        String dia = "";
        if (diaSemana < 1 || diaSemana > 7) {
            dia = "ERROR: el numero es incorrecto.";
        } else if (diaSemana == 1) {
            dia = "Lunes";
        } else if (diaSemana == 2) {
            dia = "Martes";
        } else if (diaSemana == 3) {
            dia = "Miercoles";
        } else if (diaSemana == 4) {
            dia = "Jueves";
        } else if (diaSemana == 5) {
            dia = "Viernes";
        } else if (diaSemana == 6) {
            dia = "Sabado";
        } else if (diaSemana == 7) {
            dia = "Domingo";
        }

        System.out.println("El dia correspondiente es: " + dia);

        scanner.close();
    }
}
