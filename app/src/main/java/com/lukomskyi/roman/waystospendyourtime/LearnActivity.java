package com.lukomskyi.roman.waystospendyourtime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LearnActivity extends AppCompatActivity {

    ImageView imgUdacity, imgCoursera, imgEdx, imgMit, imgHubspot, imgDuolingo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        imgUdacity = (ImageView) findViewById(R.id.img_udacity);
        imgCoursera = (ImageView) findViewById(R.id.img_courcera);
        imgEdx = (ImageView) findViewById(R.id.img_edx);
        imgMit = (ImageView) findViewById(R.id.img_mit);
        imgHubspot = (ImageView) findViewById(R.id.img_hubspot);
        imgDuolingo = (ImageView) findViewById(R.id.img_duolingo);

        View.OnClickListener listener = new View.OnClickListener() {
            String url;

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.img_udacity:
                        url = "https://www.udacity.com/";
                    case R.id.img_courcera:
                        url = "https://www.coursera.org/";
                        break;
                    case R.id.img_edx:
                        url = "https://www.edx.org/";
                        break;
                    case R.id.img_mit:
                        url = "http://ocw.mit.edu/index.htm";
                        break;
                    case R.id.img_hubspot:
                        url = "http://www.hubspot.com/";
                        break;
                    case R.id.img_duolingo:
                        url = "https://en.duolingo.com/";
                        break;
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        };
        imgUdacity.setOnClickListener(listener);
        imgCoursera.setOnClickListener(listener);
        imgEdx.setOnClickListener(listener);
        imgMit.setOnClickListener(listener);
        imgHubspot.setOnClickListener(listener);
        imgDuolingo.setOnClickListener(listener);
    }
}
