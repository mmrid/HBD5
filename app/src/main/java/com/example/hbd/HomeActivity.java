package com.example.hbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        linearLayout1 = findViewById(R.id.ucapan);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUcapan();
            }
        });

        linearLayout2 = findViewById(R.id.puisi);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPuisi();
            }
        });

        linearLayout3 = findViewById(R.id.quotes);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuotes();
            }
        });

        linearLayout3 = findViewById(R.id.about);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

    }

    public void openUcapan() {

        Intent intent = new Intent(this, Ucapan.class);
        startActivity(intent);

    }

        public void openQuotes(){

            Intent intent = new Intent(this, quotes.class);
            startActivity(intent);

    }

        public void openPuisi(){

        Intent intent = new Intent(this, puisi.class);
        startActivity(intent);

    }

        public void openAbout(){

        Intent intent = new Intent(this, about.class);
        startActivity(intent);

    }

}
