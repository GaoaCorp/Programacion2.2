/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

import java.util.Scanner;

public class Dinero20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduzca el numero de monedas de 2 euros.: ");
        int numMonedas2Euros = scanner.nextInt();

        System.out.print("Por favor introduzca el numero de monedas de 1 euro: ");
        int numMonedas1Euro = scanner.nextInt();

        System.out.print("Por favor ingrese el numero de moneda de 50 centavos.: ");
        int numMonedas50Cents = scanner.nextInt();

        System.out.print("Por favor introduce el numero de monedas de 20 céntimos.: ");
        int numMonedas20Cents = scanner.nextInt();

        System.out.print("Por favor introduce el numero de monedas de 10 céntimos.: ");
        int numMonedas10Cents = scanner.nextInt();

        double dinero = 2 * numMonedas2Euros + numMonedas1Euro + 0.5 * numMonedas50Cents + 0.2 * numMonedas20Cents + 0.1 * numMonedas10Cents;

        System.out.println("Tu tienes " + String.format("%.2f", dinero) + " euros.");

        scanner.close();
    }
}
