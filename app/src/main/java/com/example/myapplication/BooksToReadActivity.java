package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksToReadActivity extends AppCompatActivity {
    private static final String TAG = "BooksToReadActivity";
    private RecyclerView recyclerView;
    private ArrayList<Book> arrayList;
    private utill utill;
    private ListOfBookAdp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_to_read);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

