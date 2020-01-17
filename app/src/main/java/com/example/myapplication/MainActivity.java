package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button bListOfB,bReadingNow,bBookToBeRead,bFinishedBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVars();
        onClickListeners();
    }

    private void onClickListeners() {
        bListOfB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked");
                Intent intent = new Intent(MainActivity.this,ListOfBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initVars() {
        bListOfB = (Button) findViewById(R.id.bBList);
    }
}
