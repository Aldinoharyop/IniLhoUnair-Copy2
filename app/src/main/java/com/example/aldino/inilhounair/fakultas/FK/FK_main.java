package com.example.aldino.inilhounair.fakultas.FK;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FK_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fk_main);
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

        ImageButton fk1 = (ImageButton) findViewById(R.id.fksejarah);
        fk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fk1 = new Intent(FK_main.this, FK_sejarah.class);
                startActivity(fk1);
            }
        });

        ImageButton fk2 = (ImageButton) findViewById(R.id.fkprodi);
        fk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fk2 = new Intent(FK_main.this, FK_prodi.class);
                startActivity(fk2);
            }
        });
    }
}
