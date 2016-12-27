package com.example.bunhongkim.bankcardapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vp_main);
        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(),4);

        viewPager.setAdapter(myViewPagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("ON PAGE","SCROLL");
            }

            @Override
            public void onPageSelected(int position) {
                Log.d("ON PAGE","SELECTED");
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.d("ON PAGE","SCROLL STATE CHANGE");
            }
        });

    }
}
