package com.example.aldino.inilhounair.fakultas.FIB;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FIB_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fib_main);
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

        ImageButton fib1 = (ImageButton) findViewById(R.id.fibsejarah);
        fib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fib1 = new Intent(FIB_main.this, FIB_sejarah.class);
                startActivity(fib1);
            }
        });

        ImageButton fib2 = (ImageButton) findViewById(R.id.fibprodi);
        fib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fib2 = new Intent(FIB_main.this, FIB_prodi.class);
                startActivity(fib2);
            }
        });



    }
}
