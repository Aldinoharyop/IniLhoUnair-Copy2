package com.example.aldino.inilhounair.fakultas.FKM;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.aldino.inilhounair.R;

public class FKM_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fkm_main);
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

        ImageButton fkm1 = (ImageButton) findViewById(R.id.fkmsejarah);
        fkm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkm1 = new Intent(FKM_main.this, FKM_sejarah.class);
                startActivity(fkm1);
            }
        });

        ImageButton fkm2 = (ImageButton) findViewById(R.id.fkmprodi);
        fkm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkm2 = new Intent(FKM_main.this, FKM_prodi.class);
                startActivity(fkm2);
            }
        });
    }
}
