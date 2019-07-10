package com.example.hbd;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class puisi extends AppCompatActivity {
    Button clk;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puisi);

        videoView = (VideoView) findViewById(R.id.video);
        mediaController = new MediaController(this);
        Uri lokasi = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.puisii);
        videoView.setVideoURI(lokasi);
        videoView.setMediaController(mediaController);
        videoView.start();
        videoView.requestFocus();

    }

}
