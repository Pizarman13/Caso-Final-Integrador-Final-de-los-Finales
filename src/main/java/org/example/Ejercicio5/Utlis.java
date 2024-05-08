package org.example.Ejercicio5;

public class Utlis {

    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean validarAlias(String alias) {
        return alias.length() > 3;
    }
}
