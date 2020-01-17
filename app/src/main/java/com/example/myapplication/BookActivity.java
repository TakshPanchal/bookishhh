package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {
    private ImageView cover;
    private TextView title, aName;
    private int id;
    private Button bListOfB,bReadingNow,bBookToBeRead,bFinishedBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);
        title = (TextView) findViewById(R.id.tvBookTitle);
        aName = (TextView) findViewById(R.id.tvAuthorName);
        cover = (ImageView) findViewById(R.id.ivBookCover);
        utill utill = new utill();

        title.setText(com.example.myapplication.utill.getListOfBooks().get(id).getName());
        aName.setText(com.example.myapplication.utill.getListOfBooks().get(id).getAuthorName());
        Glide.with(this).
                asBitmap().
                load(com.example.myapplication.utill.getListOfBooks().get(id).getDescription()).
                into(cover);
    }
}
