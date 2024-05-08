package org.example.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private Email email;
    private List<Tweet> tweets;
    private List<UserAccount> followers;
    private List<UserAccount> following;

    public UserAccount(String alias, Email email) {
        if (!Utlis.validarEmail(email.getEmail())) {
            System.out.println("Email no válido");
        }
        if (!Utlis.validarAlias(alias)) {
            System.out.println("Alias no válido");
        }

        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }
}
