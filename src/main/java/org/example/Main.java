package org.example;

import org.example.Ejercicio4.Recursividad;
import org.example.Ejercicio5.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean salir = true;

        while (salir) {
            System.out.println("1. Ejercicio 4");
            System.out.println("2. Ejercicio 5");
            System.out.println("0. Salir");
            System.out.print("Selecciones una opción: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Ejercicio 4");
                    int num = 123;
                    System.out.println("La suma de los dígitos de " + num + " es: " + Recursividad.recursividad(num));
                    num = 1234;
                    System.out.println("La suma de los dígitos de " + num + " es: " + Recursividad.recursividad(num));
                    salir = false;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ejercicio 5");

                    Email email = new Email("diegopizarrogarrido@gmail.com");
                    Email email2 = new Email("dpizgar@myuax.com");
                    UserAccount user = new UserAccount("Diego", email);
                    UserAccount user2 = new UserAccount("Diego2", email2);

                    user.seguir(user2);
                    user.tweet(new Tweet("Hola Mundo"));
                    user2.tweet(new Tweet("Hola Mundo 2"));

                    System.out.println(user);
                    System.out.println(user2);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}