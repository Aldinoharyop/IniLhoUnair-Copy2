package com.example.aldino.inilhounair.fakultas.FISIP;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FISIP_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisip_main);
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

        ImageButton fisip1 = (ImageButton) findViewById(R.id.fisipsejarah);
        fisip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fisip1 = new Intent(FISIP_main.this, FISIP_sejarah.class);
                startActivity(fisip1);
            }
        });

        ImageButton fisip2 = (ImageButton) findViewById(R.id.fisipprodi);
        fisip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fisip2 = new Intent(FISIP_main.this, FISIP_prodi.class);
                startActivity(fisip2);
            }
        });
    }
}
