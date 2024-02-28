/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class NotaFinal19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero de preguntas: ");
        int numPreguntas = scanner.nextInt();

        System.out.print("Por favor ingrese el numero de respuesta correctas: ");
        int numCorrectas = scanner.nextInt();

        System.out.print("Por favor ingrese el numero de respuestas incorrectas: ");
        int numIncorrectas = scanner.nextInt();

        int numNoContestadas = numPreguntas - numCorrectas - numIncorrectas;

        double notaFinal = 5 * numCorrectas - numIncorrectas;

        System.out.println("La puntuacion final es: " + notaFinal);

        scanner.close();
    }
}