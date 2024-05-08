package org.example.Ejercicio4;

public interface Recursividad {

    public static int recursividad(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursividad(n / 10);
        }
    }
}
