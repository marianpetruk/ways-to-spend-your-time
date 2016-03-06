package com.lukomskyi.roman.waystospendyourtime;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CallFriendActivity extends AppCompatActivity {
    ImageButton btnCall;
    Button btnNext;
    ImageView image;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_friend);
        btnCall = (ImageButton) findViewById(R.id.btn_call);
        btnNext = (Button)findViewById(R.id.btn_call_next);
        image = (ImageView)findViewById(R.id.call_boys);
        drawable = image.getDrawable();
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CallFriendActivity.this, ReadActivity.class);
                CallFriendActivity.this.startActivity(intent);
            }
        });
    }
}
