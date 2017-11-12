package com.example.marce.hoteles;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by marce on 25/10/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.hotel1, R.drawable.hotel, R.drawable.hotel2, R.drawable.hotel3,R.drawable.hotel5,R.drawable.hotel6,
            R.drawable.hotel7,R.drawable.hotel8,R.drawable.hotel9,R.drawable.hotel10,R.drawable.hotel11,R.drawable.hotel12};


    public ViewPagerAdapter(Context context){
        this.context = context;
    }
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.customlayout, null);
        ImageView image = (ImageView) view.findViewById(R.id.foto);
        image.setImageResource(images[position]);
        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
