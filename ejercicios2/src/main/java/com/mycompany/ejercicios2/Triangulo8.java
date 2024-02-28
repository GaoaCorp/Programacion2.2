/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;

import java.util.Scanner;

public class Triangulo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Por favor ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Error: datos no aceptados.");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es EQUILATERO.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es ISOSCELES.");
        } else {
            System.out.println("El triangulo es ESCALENO.");
        }

        if (lado1 * lado1 == lado2 * lado2 + lado3 * lado3 || lado2 * lado2 == lado1 * lado1 + lado3 * lado3 || lado3 * lado3 == lado1 * lado1 + lado2 * lado2) {
            System.out.println("El triangulo es RECTANGULO.");
        }

        scanner.close();
    }
}