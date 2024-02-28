package com.mycompany.ejercicios1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Rectangulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la longitud de la base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Por favor ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);

        scanner.close();
    }
}