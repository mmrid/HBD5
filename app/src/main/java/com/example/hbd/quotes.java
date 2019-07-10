package com.example.hbd;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class quotes extends AppCompatActivity {

    ViewPager viewpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        viewpage = (ViewPager) findViewById(R.id.view);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(this);

        viewpage.setAdapter(viewPageAdapter);

    }
}
