package com.dsm2018.dms_app;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dsm2018.dms_app.Viewpager.Mainviewpagedata1;

import java.util.ArrayList;
import java.util.Calendar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class MainActivity extends AppCompatActivity {



    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;


    ViewPager vp;

    ArrayList<Mainviewpagedata1> arrayList = new ArrayList<>();
//        arrayList.add(new Mainviewpagedata1());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.vp);
        mPagerAdapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return 30;
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return false;
            }
        };
        mViewPager.setAdapter(mPagerAdapter);









        View.OnClickListener movePageListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int) v.getTag();
                vp.setCurrentItem(tag);
            }
        };

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);




    }

}








