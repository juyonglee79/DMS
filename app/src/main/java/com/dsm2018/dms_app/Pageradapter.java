package com.dsm2018.dms_app;

import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

import com.dsm2018.dms_app.models.Meal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pageradapter extends FragmentStatePagerAdapter {

    private Calendar calendar = Calendar.getInstance();
    private Date date = new Date();

        public Pageradapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            calendar.setTime(date);
            calendar.add(Calendar.DATE, position);


            switch (position){

                case 1:
                    return new MealFragment();
                case 2:
                    return new MealFragment2();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 30;
        }
}

//    public Pageradapter(android.support.v4.app.FragmentManager fm) {
//        super(fm);
//    }
//
//    @Override
//    public android.support.v4.app.Fragment getItem(int position) {
//
//        return new MealFragment();
////        for (int i = 0; i < getCount(); i++) {
////            Fragment Fragment = new Fragment();
////            return new MealFragment();
////        }
////        return new MealFragment();
//    }
//
//    @Override
//    public int getCount () {
//        return 30;
//    }
//
//}




