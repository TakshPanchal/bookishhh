package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListOfBooksActivity extends AppCompatActivity {
    private static final String TAG = "ListOfBooksActivity";
    private RecyclerView recyclerView;
    private ArrayList<Book> listOfBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_books);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rvListOfBooks);
        utill utill = new utill();
        listOfBook = com.example.myapplication.utill.getListOfBooks();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListOfBookAdp(listOfBook, ListOfBooksActivity.this));


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Log.d(TAG, "onOptionsItemSelected: Back button is pressed");
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
