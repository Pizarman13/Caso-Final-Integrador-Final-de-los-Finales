package org.example.Ejercicio5;

public class Tweet {

    private String tweet;
    private int likes;
    private int retweets;
    private int comments;

    public Tweet(String tweet, int likes, int retweets, int comments) {
        this.tweet = tweet;
        this.likes = likes;
        this.retweets = retweets;
        this.comments = comments;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getRetweets() {
        return retweets;
    }

    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweet='" + tweet + '\'' +
                ", likes=" + likes +
                ", retweets=" + retweets +
                ", comments=" + comments +
                '}';
    }
}
