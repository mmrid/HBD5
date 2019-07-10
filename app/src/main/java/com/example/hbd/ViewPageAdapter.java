package com.example.hbd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPageAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.doodle,R.drawable.slide1};

    public ViewPageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp= (ViewPager) container;
        vp.addView(view1, 0);
        return view1;
    }

    @Override
    public void destroyItem( ViewGroup container, int position,Object object) {

        ViewPager vp= (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
