/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bucles2_2;

import java.util.Scanner;

public class Cronometro8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tiempo en segundos: ");
        int tiempo = scanner.nextInt();

        int horas = tiempo / 3600;
        int minutos = (tiempo % 3600) / 60;
        int segundos = (tiempo % 3600) % 60;

        System.out.println(horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s)");

        scanner.close();
    }
}