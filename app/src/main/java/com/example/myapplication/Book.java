package com.example.myapplication;

public class Book {
    private int id;
    private String name, AuthorName, Description;
    private float rating, prize;


    public Book(int id, String name, String authorName, String description, float rating, float prize) {
        this.id = id;
        this.name = name;
        AuthorName = authorName;
        Description = description;
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

