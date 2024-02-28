/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class Iniciales18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("por favor, escriba su nombre: ");
        String nombre = scanner.next();

        System.out.print("Por favor ingresa tu primer apellido: ");
        String primerApellido = scanner.next();

        System.out.print("Por favor ingresa tu segundo apellido: ");
        String segundoApellido = scanner.next();

        String inicialNombre = nombre.substring(0, 1).toUpperCase();
        String inicialPrimerApellido = primerApellido.substring(0, 1).toUpperCase();
        String inicialSegundoApellido = segundoApellido.substring(0, 1).toUpperCase();

        System.out.println("Tus iniciales son: " + inicialNombre + "." + inicialPrimerApellido + "." + inicialSegundoApellido + ".");

        scanner.close();
    }
}
