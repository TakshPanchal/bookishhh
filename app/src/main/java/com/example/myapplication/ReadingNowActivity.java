package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class ReadingNowActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Book> ReadingNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_now);
        initVar();
        recyclerView.setLayoutManager(new LinearLayoutManager(ReadingNowActivity.this));
        recyclerView.setAdapter(new ListOfBookAdp(ReadingNow, ReadingNowActivity.this));

    }

    private void initVar() {
        recyclerView = findViewById(R.id.rvReadingNow);
        utill utill = new utill();
        ReadingNow = com.example.myapplication.utill.getReadingNow();
    }
}
