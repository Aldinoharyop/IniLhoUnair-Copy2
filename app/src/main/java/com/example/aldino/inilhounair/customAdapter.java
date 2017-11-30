package com.example.aldino.inilhounair;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Aldino on 03/11/2017.
 */

public class customAdapter extends PagerAdapter {

    private int [] imgs = {R.drawable.fk2, R.drawable.fkg, R.drawable.unair, R.drawable.fpkbutton, R.drawable.fst_button};
    private LayoutInflater inflater;
    private Context ctx;

    public customAdapter (Context ctx){
        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.swipe, container, false);
        ImageView img = (ImageView) v.findViewById(R.id.imageviewswipe);
        img.setImageResource(imgs[position]);
        /*container.addView(v);
        return v;*/
        ViewPager vp = (ViewPager) container;
        vp.addView(v, 0);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        /*container.invalidate();*/
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
