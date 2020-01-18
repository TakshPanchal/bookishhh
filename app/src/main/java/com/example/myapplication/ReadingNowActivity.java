package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ReadingNowActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Book> ReadingNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_now);
        initVar();
    }

    private void initVar() {
        recyclerView= findViewById(R.id.rvReadingNow);
    }
}
