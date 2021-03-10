package com.queensherainfotech.slidebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.queensherainfotech.slidebuttonlibrary.SlideView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlideView slideView = findViewById(R.id.slideView);

        slideView.setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideView slideView) {
                Toast.makeText(MainActivity.this, "Slide Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
