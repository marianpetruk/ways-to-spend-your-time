package com.lukomskyi.roman.waystospendyourtime;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CallFriend extends AppCompatActivity {
    ImageButton btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_friend);
        btnCall = (ImageButton) findViewById(R.id.call_button);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
            //    intent.setData(Uri.parse("tel:0123456789"));
                startActivity(intent);
            }
        });
    }
}
