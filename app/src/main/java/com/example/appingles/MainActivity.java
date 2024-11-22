package com.example.appingles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer dogPlayer;
    private MediaPlayer catPlayer;
    private MediaPlayer lionPlayer;
    private MediaPlayer monkeyPlayer;
    private MediaPlayer sheepPlayer;
    private MediaPlayer cowPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dog);
        catPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cat);
        lionPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);
        monkeyPlayer = MediaPlayer.create(getApplicationContext(), R.raw.monkey);
        sheepPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sheep);
        cowPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cow);


    }

    public void executarDog(View view){

        if (dogPlayer != null){

            dogPlayer.start();

        }

    }

    public void executarCat(View view){

        if (catPlayer != null){

            catPlayer.start();

        }

    }

    public void executarLion(View view){

        if (lionPlayer != null){

            lionPlayer.start();

        }

    }

    public void executarMonkey(View view){

        if (monkeyPlayer != null){

            monkeyPlayer.start();

        }

    }

    public void executarSheep(View view){

        if (sheepPlayer != null){

            sheepPlayer.start();

        }

    }

    public void executarCow(View view){

        if (cowPlayer != null){

            cowPlayer.start();

        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        if (dogPlayer != null && dogPlayer.isPlaying()) {
            dogPlayer.pause();
        }
        if (catPlayer != null && catPlayer.isPlaying()) {
            catPlayer.pause();
        }
        if (lionPlayer != null && lionPlayer.isPlaying()) {
            lionPlayer.pause();
        }
        if (monkeyPlayer != null && monkeyPlayer.isPlaying()) {
            monkeyPlayer.pause();
        }
        if (sheepPlayer != null && sheepPlayer.isPlaying()) {
            sheepPlayer.pause();
        }
        if (cowPlayer != null && cowPlayer.isPlaying()) {
            cowPlayer.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (dogPlayer != null) {
            dogPlayer.stop();
            dogPlayer.release();
            dogPlayer = null;
        }
        if (catPlayer != null) {
            catPlayer.stop();
            catPlayer.release();
            catPlayer = null;
        }
        if (lionPlayer != null) {
            lionPlayer.stop();
            lionPlayer.release();
            lionPlayer = null;
        }
        if (monkeyPlayer != null) {
            monkeyPlayer.stop();
            monkeyPlayer.release();
            monkeyPlayer = null;
        }
        if (sheepPlayer != null) {
            sheepPlayer.stop();
            sheepPlayer.release();
            sheepPlayer = null;
        }
        if (cowPlayer != null) {
            cowPlayer.stop();
            cowPlayer.release();
            cowPlayer = null;
        }
    }

}