package com.example.hbd;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ucapan extends AppCompatActivity {

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucapan);

        audio = MediaPlayer.create(this, R.raw.sepanjanghidup);
        audio.setLooping(true);
        audio.isPlaying();
        audio.setVolume(1,1);
        audio.start();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        audio.stop();
    }
}
