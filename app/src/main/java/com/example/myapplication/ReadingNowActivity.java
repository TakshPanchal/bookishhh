package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReadingNowActivity extends AppCompatActivity {
    private static final String TAG = "ReadingNowActivity";
    RecyclerView recyclerView;
    ArrayList<Book> ReadingNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_now);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initVar();
        recyclerView.setLayoutManager(new LinearLayoutManager(ReadingNowActivity.this));
        recyclerView.setAdapter(new ListOfBookAdp(ReadingNow, ReadingNowActivity.this));

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

    private void initVar() {
        recyclerView = findViewById(R.id.rvReadingNow);
        utill utill = new utill();
        ReadingNow = com.example.myapplication.utill.getReadingNow();
    }
}
