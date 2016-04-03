package com.example.rianeroldan.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Intent intent = getIntent();
        String code = intent.getStringExtra("code");

        CheckedTextView tv1 = (CheckedTextView) findViewById(R.id.checkedTextView);
        CheckedTextView tv2 = (CheckedTextView) findViewById(R.id.checkedTextView1);
        CheckedTextView tv3 = (CheckedTextView) findViewById(R.id.checkedTextView2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        TextView tv = (TextView) findViewById(R.id.textView2);
        Typeface font = Typeface.createFromAsset(getAssets(), "Amatic-Bold.ttf");
        tv.setTypeface(font);
        tv1.setTypeface(font);
        tv2.setTypeface(font);
        tv3.setTypeface(font);

        if (code.equals("5012874022267")) {

        } else if (code.equals("773602051762")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.lipstick));
            tv1.setChecked(true);
            tv2.setChecked(true);
            tv3.setChecked(false);
        }
    }
}
