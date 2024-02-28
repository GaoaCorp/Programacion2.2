/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class DiasMes15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduce un número entre 1 y 12 correspondiente a un mes: ");
        int mes = scanner.nextInt();

        int dias = 0;
        if (mes < 1 || mes > 12) {
            dias = -1;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2) {
            dias = 28;
        }

        System.out.println("El mes tiene " + dias + " dias.");

        scanner.close();
    }
}
