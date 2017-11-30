package com.example.aldino.inilhounair.fakultas.FKG;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FKG_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fkg_main);
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

        ImageButton fkg1 = (ImageButton) findViewById(R.id.fkgsejarah);
        fkg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkg1 = new Intent(FKG_main.this, FKG_sejarah.class);
                startActivity(fkg1);
            }
        });

        ImageButton fkg2 = (ImageButton) findViewById(R.id.fkgprodi);
        fkg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkg2 = new Intent(FKG_main.this, FKG_prodi.class);
                startActivity(fkg2);
            }
        });
    }
}
