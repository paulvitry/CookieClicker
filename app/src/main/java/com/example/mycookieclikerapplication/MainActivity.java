package com.example.mycookieclikerapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    ImageView image;
    int score = 0;
    Animation animation;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        image = findViewById(R.id.image);
        animation = new TranslateAnimation(0, 0, 0, -100);
        animation.setDuration(500);
        button = findViewById(R.id.button);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;
                text.setText("SCORE = " + score);
                image.startAnimation(animation);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TemporyActivity.class);
                startActivity(i);
            }
        });
    }
}
