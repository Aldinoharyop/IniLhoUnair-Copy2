package com.example.aldino.inilhounair.fakultas.FPsi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FPsi_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpsi_main);
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

        ImageButton fpsi1 = (ImageButton) findViewById(R.id.fpsisejarah);
        fpsi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpsi1 = new Intent(FPsi_main.this, FPsi_sejarah.class);
                startActivity(fpsi1);
            }
        });

        ImageButton fpsi2 = (ImageButton) findViewById(R.id.fpsiprodi);
        fpsi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpsi2 = new Intent(FPsi_main.this, FPsi_prodi.class);
                startActivity(fpsi2);
            }
        });
    }
}
