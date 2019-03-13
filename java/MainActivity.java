package com.addict.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.addict.demo.Slider.AutoSlideViewPager;
import com.addict.demo.adapter.ImageSlideAdapter;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private AutoSlideViewPager mHomeBannerSlider;
    private ImageSlideAdapter mSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHomeBannerSlider = findViewById(R.id.home_banner);


        //region banner
        mSliderAdapter = new ImageSlideAdapter(MainActivity.this, MainActivity.this);
        mHomeBannerSlider.setAdapter(mSliderAdapter);
        mHomeBannerSlider.setIntervalTime(2500);
        mHomeBannerSlider.setAutoScrollDurationFactor(8.0d);
        mHomeBannerSlider.setSwipeScrollDurationFactor(1.0d);
        mHomeBannerSlider.startSlide();
        //endregion

    }
}
