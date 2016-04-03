package com.example.rianeroldan.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        Typeface font = Typeface.createFromAsset(getAssets(), "Amatic-Bold.ttf");
        tv.setTypeface(font);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Amatic.ttf");
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setTypeface(font2);
        Button start = (Button)findViewById(R.id.start);
        start.setTypeface(font);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });

    }
}
