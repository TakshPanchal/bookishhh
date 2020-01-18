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
        // TODO: 18/1/20 add more boook 
        id = 0;
        String name = "The Testaments";
        String Aname = "Margaret Atwood !";
        String url = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1549292344l/42975172.jpg";
        String des = "Author and activist Margaret Atwood wins this year’s Best Fiction award for her long-anticipated sequel to the dystopian classic The Handmaid’s Tale. The book picks up the story 15 years after handmaid Offred’s ambiguous fate in the theocratic nation of Gilead and continues the saga’s dark contemporary resonance. In fact, Atwood’s stated inspiration for her new novel is direct: “The world we’ve been living in.”";
        float rating = 0f;
        float prize = 0f;

        ListOfBooks.add(new Book(id, name, Aname, des, url, rating, prize));

        id++;
        name = "Normal People";
        Aname = "Sally Rooney";
        des = "At school Connell and Marianne pretend not to know each other. He’s popular and well-adjusted, star of the school soccer team while she is lonely, proud, and intensely private. But when Connell comes to pick his mother up from her housekeeping job at Marianne’s house, a strange and indelible connection grows between the two teenagers—one they are determined to conceal.\n" +
                "\n" +
                "A year later, they’re both studying at Trinity College in Dublin. Marianne has found her feet in a new social world while Connell hangs at the sidelines, shy and uncertain. Throughout their years in college, Marianne and Connell circle one another, straying toward other people and possibilities but always magnetically, irresistibly drawn back together. Then, as she veers into self-destruction and he begins to search for meaning elsewhere, each must confront how far they are willing to go to save the other.\n" +
                "\n" +
                "Sally Rooney brings her brilliant psychological acuity and perfectly spare prose to a story that explores the subtleties of class, the electricity of first love, and the complex entanglements of family and friendship";
        url = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1571423190l/41057294._SY475_.jpg";
        ListOfBooks.add(new Book(id, name, Aname, des, url, rating, prize));

        id++;
        name = "Fleishman Is in Trouble";
        Aname = " Taffy Brodesser-Akner";
    des = "";
            url = "https://www.goodreads.com/book/show/42201996-ask-again-yes?from_choice=true";
        ListOfBooks.add(new Book(id, name, Aname, des, url, rating, prize));


    }


}
