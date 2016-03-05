package com.lukomskyi.roman.waystospendyourtime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ReadActivity extends AppCompatActivity {
    ImageButton btnFindBooks;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        btnFindBooks = (ImageButton)findViewById(R.id.btn_find_books);
        btnNext = (Button)findViewById(R.id.btn_read_next);

        btnFindBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://books.google.com/"));
                startActivity(intent);
            }
        });
    }
}
