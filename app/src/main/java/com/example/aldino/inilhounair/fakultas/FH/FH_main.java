package com.example.aldino.inilhounair.fakultas.FH;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FH_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fh_main);
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

        ImageButton fh1 = (ImageButton) findViewById(R.id.fhsejarah);
        fh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fh1 = new Intent(FH_main.this, FH_sejarah.class);
                startActivity(fh1);
            }
        });

        ImageButton fh2 = (ImageButton) findViewById(R.id.fhprodi);
        fh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fh2 = new Intent(FH_main.this, FH_prodi.class);
                startActivity(fh2);
            }
        });

    }
}
