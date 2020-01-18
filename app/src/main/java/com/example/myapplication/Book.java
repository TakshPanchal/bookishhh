package com.example.myapplication;

public class Book {
    private int id;
    private String name, AuthorName, Description, url;
    private float rating, prize;


    public String getUrl() {
        return url;
    }

    public Book(int id, String name, String authorName, String description, String url, float rating, float prize) {
        this.id = id;
        this.name = name;
        AuthorName = authorName;
        Description = description;
        this.url = url;
        this.rating = rating;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public String getDescription() {
        return Description;
    }

    public float getRating() {
        return rating;
    }

    public float getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", Description='" + Description + '\'' +
                ", rating=" + rating +
                ", prize=" + prize +
                '}';
    }
}

