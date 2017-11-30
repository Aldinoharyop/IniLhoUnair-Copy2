package com.example.aldino.inilhounair;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.aldino.inilhounair.fakultas.FEB.FEB_main;
import com.example.aldino.inilhounair.fakultas.FF.FF_main;
import com.example.aldino.inilhounair.fakultas.FH.FH_main;
import com.example.aldino.inilhounair.fakultas.FIB.FIB_main;
import com.example.aldino.inilhounair.fakultas.FIB.FIB_prodi;
import com.example.aldino.inilhounair.fakultas.FISIP.FISIP_main;
import com.example.aldino.inilhounair.fakultas.FK.FK_main;
import com.example.aldino.inilhounair.fakultas.FKG.FKG_main;
import com.example.aldino.inilhounair.fakultas.FKH.FKH_main;
import com.example.aldino.inilhounair.fakultas.FKM.FKM_main;
import com.example.aldino.inilhounair.fakultas.FKP.FKP_main;
import com.example.aldino.inilhounair.fakultas.FPK.FPK_main;
import com.example.aldino.inilhounair.fakultas.FPsi.FPsi_main;
import com.example.aldino.inilhounair.fakultas.FST.FST_main;
import com.example.aldino.inilhounair.fakultas.FV.FV_main;

import java.util.ArrayList;
import java.util.Arrays;

public class Fakultas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakultas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent floating = new Intent(Fakultas.this,ListProdi.class );
                startActivity(floating);
            }
        });

        //--------------------------------------------------------------------------



        ImageButton fst = (ImageButton) findViewById(R.id.fst);
        fst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fst = new Intent(Fakultas.this, FST_main.class);
                startActivity(fst);
            }
        });

        ImageButton fkm = (ImageButton) findViewById(R.id.fkm);
        fkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkm = new Intent(Fakultas.this, FKM_main.class);
                startActivity(fkm);
            }
        });

        ImageButton fkh = (ImageButton) findViewById(R.id.fkh);
        fkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkh = new Intent(Fakultas.this, FKH_main.class);
                startActivity(fkh);
            }
        });

        ImageButton feb = (ImageButton) findViewById(R.id.feb);
        feb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feb = new Intent(Fakultas.this, FEB_main.class);
                startActivity(feb);
            }
        });

        ImageButton ff = (ImageButton) findViewById(R.id.ff);
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ff = new Intent(Fakultas.this, FF_main.class);
                startActivity(ff);
            }
        });

        ImageButton fh = (ImageButton) findViewById(R.id.fh);
        fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fh = new Intent(Fakultas.this, FH_main.class);
                startActivity(fh);
            }
        });

        ImageButton fib = (ImageButton) findViewById(R.id.fib);
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fib = new Intent(Fakultas.this, FIB_main.class);
                startActivity(fib);
            }
        });

        ImageButton fisip = (ImageButton) findViewById(R.id.fisip);
        fisip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fisip = new Intent(Fakultas.this, FISIP_main.class);
                startActivity(fisip);
            }
        });

        ImageButton fk = (ImageButton) findViewById(R.id.fk);
        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fk = new Intent(Fakultas.this, FK_main.class);
                startActivity(fk);
            }
        });

        ImageButton fkg = (ImageButton) findViewById(R.id.fkg);
        fkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkg = new Intent(Fakultas.this, FKG_main.class);
                startActivity(fkg);
            }
        });

        ImageButton fkp = (ImageButton) findViewById(R.id.fkp);
        fkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fkp = new Intent(Fakultas.this, FKP_main.class);
                startActivity(fkp);
                Toast.makeText(Fakultas.this, "Masuk FKP", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton fpsi = (ImageButton) findViewById(R.id.fpsi);
        fpsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpsi = new Intent(Fakultas.this, FPsi_main.class);
                startActivity(fpsi);
            }
        });

        ImageButton fpk = (ImageButton) findViewById(R.id.fpk);
        fpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpk = new Intent(Fakultas.this, FPK_main.class);
                startActivity(fpk);
            }
        });

        ImageButton fv = (ImageButton) findViewById(R.id.fv);
        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fv = new Intent(Fakultas.this, FV_main.class);
                startActivity(fv);
            }
        });
    }
}
