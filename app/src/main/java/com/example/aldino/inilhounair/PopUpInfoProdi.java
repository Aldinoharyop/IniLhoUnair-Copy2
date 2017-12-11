package com.example.aldino.inilhounair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.example.aldino.inilhounair.Informasi;

public class PopUpInfoProdi extends AppCompatActivity {
    public static String text;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_info_prodi);


/*        class = ListProdi.class;
        if (text.equals("manajemen")){
            textView.setText("@String/coba");
        }*/

        //----------------------------------------------------
        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.6));
    }
}
