package org.example;

import org.example.Ejercicio4.Recursividad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 4");
        int num = 123;
        System.out.println("La suma de los digitos de " + num + " es: " + Recursividad.recursividad(num));

        num = 1234;
        System.out.println("La suma de los digitos de " + num + " es: " + Recursividad.recursividad(num));

    }
}