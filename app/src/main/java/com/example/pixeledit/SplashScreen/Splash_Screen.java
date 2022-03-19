package com.example.pixeledit.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.pixeledit.MainActivity;
import com.example.pixeledit.R;

public class Splash_Screen extends AppCompatActivity {

    private TextView app_txt,loading_txt;
    Animation fadein,blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        idBinding();

        blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        fadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        app_txt.setAnimation(fadein);
        loading_txt.setAnimation(blink);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Screen.this, MainActivity.class));
                finish();
            }
        },4000);

    }


    void idBinding(){
        app_txt = findViewById(R.id.app_txt);
        loading_txt = findViewById(R.id.loading_txt);
    }
}