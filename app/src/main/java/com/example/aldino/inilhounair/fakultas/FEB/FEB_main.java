package com.example.aldino.inilhounair.fakultas.FEB;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FEB_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ImageButton feb1 = (ImageButton) findViewById(R.id.febsejarah);
        feb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feb1 = new Intent(FEB_main.this, FEB_sejarah.class);
                startActivity(feb1);
            }
        });

        ImageButton feb2 = (ImageButton) findViewById(R.id.febprodi);
        feb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feb2 = new Intent(FEB_main.this, FEB_prodi.class);
                startActivity(feb2);
            }
        });

    }
}
