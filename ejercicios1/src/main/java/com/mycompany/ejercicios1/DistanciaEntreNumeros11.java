/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class DistanciaEntreNumeros11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Por favor ingresa el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double diferencia = numero2 - numero1;
        double distancia = Math.sqrt(diferencia * diferencia);

        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);

        scanner.close();
    }
}