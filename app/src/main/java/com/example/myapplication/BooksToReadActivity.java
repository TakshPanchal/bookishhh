package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BooksToReadActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Book> arrayList;
    private utill utill;
    private ListOfBookAdp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_to_read);
        initVars();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initVars() {
        utill = new utill();
        arrayList = com.example.myapplication.utill.getBooksToBeRead();
        adapter = new ListOfBookAdp(arrayList,BooksToReadActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }
}
