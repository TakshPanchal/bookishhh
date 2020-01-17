package com.example.myapplication;

import java.util.ArrayList;

public class utill {
    static private ArrayList<Book> ListOfBooks;
    static private ArrayList<Book> readingNow;
    static private ArrayList<Book> booksToBeRead;
    static private ArrayList<Book> finishedBook;
    static private int id;

    public utill() {
        if (ListOfBooks == null) {
            ListOfBooks = new ArrayList<>();
            init();
        }
        if (readingNow == null) {
            readingNow = new ArrayList<>();
        }
        if (booksToBeRead == null) {
            booksToBeRead = new ArrayList<>();
        }
        if (finishedBook == null) {
            finishedBook = new ArrayList<>();
        }

    }

    public static ArrayList<Book> getListOfBooks() {
        return ListOfBooks;
    }

    public static ArrayList<Book> getReadingNow() {
        return readingNow;
    }

    public static ArrayList<Book> getBooksToBeRead() {
        return booksToBeRead;
    }

    public static ArrayList<Book> getFinishedBook() {
        return finishedBook;
    }

    public boolean addReadingNow(Book b) {

        return readingNow.add(b);
        //return true if book is added
    }

    public boolean addToBeReadi(Book b) {

        return booksToBeRead.add(b);
        //return true if book is added
    }

    public boolean addfinishedBook(Book b) {

        return finishedBook.add(b);
        //return true if book is added
    }


    private static void init() {
        id = 0;
        String name = "The Testaments";
        String Aname = "Margaret Atwood !";
        String des = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1549292344l/42975172.jpg";
        float rating = 0f;
        float prize = 0f;

        ListOfBooks.add(new Book(id, name, Aname, des, rating, prize));

        id++;
        name = "Normal People";
        Aname = "Sally Rooney";
        des = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1571423190l/41057294._SY475_.jpg";
        ListOfBooks.add(new Book(id, name, Aname, des, rating, prize));

        id++;
        name = "Fleishman Is in Trouble";
        Aname = " Taffy Brodesser-Akner";
        des = "https://www.goodreads.com/book/show/42201996-ask-again-yes?from_choice=true";
        ListOfBooks.add(new Book(id, name, Aname, des, rating, prize));




    }


}
