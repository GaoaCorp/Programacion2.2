package com.mycompany.ejercicios1;


import java.util.Scanner;

public class Saludar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("por favor, escriba su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Hola, " + name + "! Encantado de conocerte.");

        scanner.close();
    }
}
