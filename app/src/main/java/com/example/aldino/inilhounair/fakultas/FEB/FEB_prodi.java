package com.example.aldino.inilhounair.fakultas.FEB;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupWindow;

import com.example.aldino.inilhounair.Popup;
import com.example.aldino.inilhounair.R;

public class FEB_prodi extends AppCompatActivity {
    public static String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb_prodi);
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

        Button m = (Button) findViewById(R.id.manajemen);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "manajemen";
                startActivity(new Intent(FEB_prodi.this, Popup.class));
            }
        });


    }
}
