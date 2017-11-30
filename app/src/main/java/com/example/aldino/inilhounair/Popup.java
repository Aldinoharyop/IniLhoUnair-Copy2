package com.example.aldino.inilhounair;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.example.aldino.inilhounair.fakultas.FEB.FEB_prodi;

/**
 * Created by Aldino on 16/11/2017.
 */

public class Popup extends Activity {
    public static String text;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = (TextView) findViewById(R.id.textView);

        text = FEB_prodi.text;
        if (text.equals("manajemen")){
            textView.setText("@String/coba");
        }
        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.6));
    }
}
