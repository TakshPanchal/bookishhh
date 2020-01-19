package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button bListOfB, bReadingNow, bBookToBeRead, bFinishedBook;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getSupportActionBar().home
// TODO: 18/1/20 Add back button to all 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setHomeButtonEnabled(true);
        initVars();
        onClickListeners();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Log.d(TAG, "onOptionsItemSelected: Back Button is pressed");
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void onClickListeners() {
        bListOfB.setOnClickListener(this);
        bBookToBeRead.setOnClickListener(this);
        bReadingNow.setOnClickListener(this);
        bFinishedBook.setOnClickListener(this);
    }

    private void initVars() {
        bListOfB = (Button) findViewById(R.id.bBList);
        bReadingNow = (Button) findViewById(R.id.bBreadN);
        bBookToBeRead = (Button) findViewById(R.id.bBtoBeR);
        bFinishedBook = (Button) findViewById(R.id.bBF);
        // TODO: 18/1/20 about button 
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bBList:
                Log.d(TAG, "onClick: clicked");
                intent = new Intent(MainActivity.this, ListOfBooksActivity.class);
                startActivity(intent);
                break;
                //completed
            case R.id.bBreadN:
                intent = new Intent(MainActivity.this, ReadingNowActivity.class);
                startActivity(intent);
                break;
            //completed
            case R.id.bBtoBeR :
                intent = new Intent(MainActivity.this,BooksToReadActivity.class);
                startActivity(intent);
                break;
            case R.id.bBF:
                intent = new Intent(MainActivity.this, ListOfBooksActivity.class);
                startActivity(intent);
                break;

        }


    }
}
