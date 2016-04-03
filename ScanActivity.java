package com.example.rianeroldan.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText barcode = (EditText) findViewById(R.id.editText);
        Typeface font = Typeface.createFromAsset(getAssets(), "Amatic-Bold.ttf");
        barcode.setTypeface(font);
        Button start = (Button) findViewById(R.id.start);
        start.setTypeface(font);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (barcode.getText() == null || barcode.getText().toString().equals("")) {
                    barcode.setError("You must enter a value");
                } else if (barcode.getText().toString().trim().equals("5012874022267") || barcode.getText().toString().trim().equals("773602051762")) {
                    Intent intent = new Intent(ScanActivity.this, ProductActivity.class);
                    intent.putExtra("code", barcode.getText().toString().trim());
                    startActivity(intent);
                } else {
                    Toast.makeText(ScanActivity.this, "Error in product lookup, please try again later", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}