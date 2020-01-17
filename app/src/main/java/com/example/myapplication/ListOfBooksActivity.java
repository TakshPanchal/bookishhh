package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListOfBooksActivity extends AppCompatActivity {
    private static final String TAG = "ListOfBooksActivity";
    private RecyclerView recyclerView;
    private ArrayList<Book> listOfBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_books);
        recyclerView = findViewById(R.id.rvListOfBooks);
        utill utill = new utill();
        listOfBook = com.example.myapplication.utill.getListOfBooks();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListOfBookAdp(listOfBook, ListOfBooksActivity.this));


    }
}
