package com.example.aldino.inilhounair.fakultas.FKH;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FKH_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fkh_main);
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

        ImageButton fkh1 = (ImageButton) findViewById(R.id.fkhsejarah);
        fkh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkh1 = new Intent(FKH_main.this, FKH_sejarah.class);
                startActivity(fkh1);
            }
        });

        ImageButton fkh2 = (ImageButton) findViewById(R.id.fkhprodi);
        fkh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkh2 = new Intent(FKH_main.this, FKH_prodi.class);
                startActivity(fkh2);
            }
        });
    }
}
