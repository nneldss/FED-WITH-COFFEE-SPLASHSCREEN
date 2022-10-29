package com.demo.fedupcoffeesplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        music = MediaPlayer.create(MainActivity.this, R.raw.introsound);
        music.start();
        setTheme(R.style.Theme_FEDUPCOFFEESPLASHSCREEN);
        setContentView(R.layout.activity_main);
    }
}