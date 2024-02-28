/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class MinutosAHoras7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero de minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println("El tiempo equivalente en horas y minutos es: " + horas + " horas y " + minutosRestantes + " minutos.");

        scanner.close();
    }
}
