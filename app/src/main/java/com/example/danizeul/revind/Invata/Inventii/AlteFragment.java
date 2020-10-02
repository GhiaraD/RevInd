package com.example.danizeul.revind.Invata.Inventii;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.R;


public class AlteFragment extends Fragment {

    RelativeLayout RAltePart1,RAltePart2,RAltePart3,RAltePart4,RAltePart5,RAltePart6;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte,container,false);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        RAltePart1 = (RelativeLayout) view.findViewById(R.id.AltePart1);
        RAltePart2 = (RelativeLayout) view.findViewById(R.id.AltePart2);
        RAltePart3 = (RelativeLayout) view.findViewById(R.id.AltePart3);
        RAltePart4 = (RelativeLayout) view.findViewById(R.id.AltePart4);
        RAltePart5 = (RelativeLayout) view.findViewById(R.id.AltePart5);
        RAltePart6 = (RelativeLayout) view.findViewById(R.id.AltePart6);

        if(globalProgressClass.getAltePart1()==1)
        {
            RAltePart1.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getAltePart1()==2)
        {
            RAltePart1.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }



        if(globalProgressClass.getAltePart2()==1)
        {
            RAltePart2.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getAltePart2()==2)
        {
            RAltePart2.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getAltePart3()==1)
        {
            RAltePart3.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getAltePart3()==2)
        {
            RAltePart3.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getAltePart4()==1)
        {
            RAltePart4.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getAltePart4()==2)
        {
            RAltePart4.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }



        if(globalProgressClass.getAltePart5()==1)
        {
            RAltePart5.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getAltePart5()==2)
        {
            RAltePart5.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }



        if(globalProgressClass.getAltePart6()==1)
        {
            RAltePart6.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getAltePart6()==2)
        {
            RAltePart6.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }


        RAltePart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart1()==0)globalProgressClass.setAltePart1(1);

                Fragment newFragment = new Alte1Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        RAltePart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart2()==0)globalProgressClass.setAltePart2(1);

                Fragment newFragment = new Alte2Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        RAltePart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart3()==0)globalProgressClass.setAltePart3(1);

                Fragment newFragment = new Alte3Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        RAltePart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart4()==0)globalProgressClass.setAltePart4(1);

                Fragment newFragment = new Alte4Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        RAltePart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart5()==0)globalProgressClass.setAltePart5(1);

                Fragment newFragment = new Alte5Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        RAltePart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getAltePart6()==0)globalProgressClass.setAltePart6(1);

                Fragment newFragment = new Alte6Fragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });



        return view;
    }
}
