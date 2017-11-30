package com.example.aldino.inilhounair.fakultas.FF;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FF_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ff_main);
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

        final ImageButton ff1 = (ImageButton) findViewById(R.id.ffsejarah);
        ff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ff1 = new Intent(FF_main.this, FF_sejarah.class);
                startActivity(ff1);
            }
        });

        ImageButton ff2 = (ImageButton) findViewById(R.id.ffprodi);
        ff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ff2 = new Intent(FF_main.this, FF_prodi.class);
                startActivity(ff2);
            }
        });
    }
}
