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

    public void seguir(UserAccount usuario) {
        if (this.following.contains(usuario)) {
            System.out.println("Ya sigues a este usuario.");
            return;
        }

        if (this.equals(usuario)) {
            System.out.println("No puedes seguirte a ti mismo.");
            return;
        }

        this.following.add(usuario);
        usuario.followers.add(this);
    }

    public void tweet(Tweet tweet) {
        this.tweets.add(tweet);
        actualizarSeguidores(tweet);
    }

    public void actualizarSeguidores(Tweet tweet) {
        for (UserAccount follower : followers) {
            follower.tweets.add(tweet);
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email=" + email +
                '}';
    }
}
