package com.dsm2018.dms_app;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dsm2018.dms_app.models.Meal;

import java.util.ArrayList;


//public class MealFragment extends Fragment {
//
//    private int mPageNumber;
//
//    public static MealFragment create(int pageNumber) {
//        MealFragment fragment = new MealFragment();
//        Bundle args = new Bundle();
//        args.putInt("page", pageNumber);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mPageNumber = getArguments().getInt("page");
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.item_viewpager, container, false);
//        return rootView;
//    }
//}




public class MealFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return (View) inflater.inflate(R.layout.item_viewpager, container, false);

        View mView;
        TextView textViewbreakfast, textViewlunch, textViewdinnner;

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.item_viewpager, container, false);

        textViewbreakfast = (TextView)mView.findViewById(R.id.Breakfast_meal);
        textViewlunch = (TextView)mView.findViewById(R.id.Lunch_meal);
        textViewdinnner = (TextView)mView.findViewById(R.id.Dinner_meal);


        return mView;
    }
    }



}