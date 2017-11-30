package com.example.aldino.inilhounair.fakultas.FST;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FST_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fst_main);
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

        ImageButton fst1 = (ImageButton) findViewById(R.id.fstsejarah);
        fst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fst1 = new Intent(FST_main.this, FST_sejarah.class);
                startActivity(fst1);
            }
        });

        ImageButton fst2 = (ImageButton) findViewById(R.id.fstprodi);
        fst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fst2 = new Intent(FST_main.this, FST_prodi.class);
                startActivity(fst2);
            }
        });
    }
}
