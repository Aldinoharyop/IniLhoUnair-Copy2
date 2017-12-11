package com.example.aldino.inilhounair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;



public class Home extends AppCompatActivity {



    CarouselView carouselView;
    int[] sampleImages = {R.drawable.unair, R.drawable.ulaz, R.drawable.fkg, R.drawable.fkgambar, R.drawable.fhgambar};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        ImageButton imageButton = (ImageButton) findViewById(R.id.sejarah);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Sejarah.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.fakultasJurusan);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Home.this, Fakultas.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.fasilitas);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, ScrollingActivity.class);
                startActivity(i);
            }
        });
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}
