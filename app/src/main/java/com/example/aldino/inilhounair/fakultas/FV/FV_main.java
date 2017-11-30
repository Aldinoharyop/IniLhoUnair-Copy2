package com.example.aldino.inilhounair.fakultas.FV;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FV_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fv_main);
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

        ImageButton fv1 = (ImageButton) findViewById(R.id.fvsejarah);
        fv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fv1 = new Intent(FV_main.this, FV_sejarah.class);
                startActivity(fv1);
            }
        });

        ImageButton fv2 = (ImageButton) findViewById(R.id.fvprodi);
        fv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fv2 = new Intent(FV_main.this, FV_prodi.class);
                startActivity(fv2);
            }
        });
    }
}
