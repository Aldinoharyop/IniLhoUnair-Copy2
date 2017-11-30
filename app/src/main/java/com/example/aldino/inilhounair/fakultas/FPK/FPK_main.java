package com.example.aldino.inilhounair.fakultas.FPK;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FPK_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpk_main);
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

        ImageButton fpk1 = (ImageButton) findViewById(R.id.fpksejarah);
        fpk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpk1 = new Intent(FPK_main.this, FPK_sejarah.class);
                startActivity(fpk1);
            }
        });

        ImageButton fpk2 = (ImageButton) findViewById(R.id.fpkprodi);
        fpk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpk2 = new Intent(FPK_main.this, FPK_prodi.class);
                startActivity(fpk2);
            }
        });
    }
}
