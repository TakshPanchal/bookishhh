package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cover;
    private TextView title, aName, description;
    private utill utill;
    private int id;
    private Button bReadingNow, bBookToBeRead, bFinishedBook;

    // TODO: 18/1/20 add book 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getSupportActionBar().
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        init();
        settingAllViews();
        bReadingNow.setOnClickListener(this);
        bFinishedBook.setOnClickListener(this);
        bBookToBeRead.setOnClickListener(this);
        // TODO: 18/1/20 make dlt option  
        // TODO: 18/1/20 debug logical errors like cheching book list 

    }


    private void settingAllViews() {

        title.setText(com.example.myapplication.utill.getListOfBooks().get(id).getName());
        aName.setText("By " + com.example.myapplication.utill.getListOfBooks().get(id).getAuthorName());
        Glide.with(this).
                asBitmap().
                load(com.example.myapplication.utill.getListOfBooks().get(id).getUrl()).
                into(cover);
        description.setText(com.example.myapplication.utill.getListOfBooks().get(id).getDescription());


    }

    private void init() {
        Intent intent = getIntent();
        id = intent.getIntExtra("id", 0);
        title = (TextView) findViewById(R.id.tvBookTitle);
        aName = (TextView) findViewById(R.id.tvAuthorName);
        description = (TextView) findViewById(R.id.tvDescription);
        cover = (ImageView) findViewById(R.id.ivBookCover);
        bReadingNow = (Button) findViewById(R.id.bBreadN);
        bBookToBeRead = (Button) findViewById(R.id.bBtoBeR);
        bFinishedBook = (Button) findViewById(R.id.bBF);
        utill = new utill();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bBreadN:
                if (doesContain(com.example.myapplication.utill.getListOfBooks().get(id))) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(BookActivity.this);
                    builder.setMessage("You have Already added");

                    builder.create().show();
                } else {
                    if (utill.addReadingNow(com.example.myapplication.utill.getListOfBooks().get(id)))
                        Toast.makeText(this, "Book is added to Reading list Successfully", Toast.LENGTH_SHORT).show();
                    else Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.bBtoBeR:
                if (com.example.myapplication.utill.getBooksToBeRead().contains(com.example.myapplication.utill.getBooksToBeRead().get(id))) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(BookActivity.this);
                    builder.setMessage("You have Already added");

                    builder.create().show();
                } else {
                    if (utill.addToBeReadi(com.example.myapplication.utill.getListOfBooks().get(id)))
                        Toast.makeText(this, "Book is added to be Read list Successfully", Toast.LENGTH_SHORT).show();
                    else Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.bBF:
                if (com.example.myapplication.utill.getFinishedBook().contains(com.example.myapplication.utill.getBooksToBeRead().get(id))) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(BookActivity.this);
                    builder.setMessage("You have Already added");

                    builder.create().show();
                } else {
                    if (utill.addfinishedBook(com.example.myapplication.utill.getListOfBooks().get(id)))
                        Toast.makeText(this, "Book is added to be Finished booklist Successfully", Toast.LENGTH_SHORT).show();
                    else Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

                }


                break;
        }

    }

    private boolean doesContain(Book book) {
        return com.example.myapplication.utill.getReadingNow().contains(book);
    }
}
