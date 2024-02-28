/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class HoraLlegada17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduce el horario de salida (HH): ");
        int horasSalida = scanner.nextInt();

        System.out.print("Por favor introduzca los minutos de salida (MM): ");
        int minutosSalida = scanner.nextInt();

        System.out.print("Por favor ingrese los segundos de salida (SS): ");
        int segundosSalida = scanner.nextInt();

        System.out.print("Por favor ingrese el tiempo total de viaje en segundos (T): ");
        int segundosViaje = scanner.nextInt();

        int segundosTotales = segundosSalida + minutosSalida * 60 + horasSalida * 3600 + segundosViaje;
        int horasLlegada = segundosTotales / 3600;
        int minutosLlegada = (segundosTotales % 3600) / 60;
        int segundosLlegada = (segundosTotales % 3600) % 60;

        System.out.println("El ciclista llegará a la ciudad B a las " + horasLlegada + " horas, " + minutosLlegada + " minutos y " + segundosLlegada + " segundos.");

        scanner.close();
    }
}
