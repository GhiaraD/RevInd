package com.example.danizeul.revind.Invata.Cauze;

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


public class CauzeFragment extends Fragment {

    RelativeLayout CauzeIntroducere,CauzeEtimologie,CauzeMareaBritanie,CauzeEuropa;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cauze,container,false);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        CauzeIntroducere = (RelativeLayout) view.findViewById(R.id.CauzeIntroducere);
        CauzeEtimologie = (RelativeLayout) view.findViewById(R.id.CauzeEtimologie);
        CauzeMareaBritanie = (RelativeLayout) view.findViewById(R.id.CauzeMareaBritanie);
        CauzeEuropa = (RelativeLayout) view.findViewById(R.id.CauzeEuropa);

        //Toast.makeText(getActivity()," "+globalProgressClass.getCauzeIntro(), Toast.LENGTH_LONG).show();

        if(globalProgressClass.getCauzeIntro()==1)
        {
            CauzeIntroducere.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getCauzeIntro()==2)
        {
            CauzeIntroducere.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getCauzeEtim()==1)
        {
            CauzeEtimologie.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getCauzeEtim()==2)
        {
            CauzeEtimologie.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getCauzeEU()==1)
        {
            CauzeEuropa.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getCauzeEU()==2)
        {
            CauzeEuropa.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getCauzeMB()==1)
        {
            CauzeMareaBritanie.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getCauzeMB()==2)
        {
            CauzeMareaBritanie.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        CauzeIntroducere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getCauzeIntro()==0)globalProgressClass.setCauzeIntro(1);

                Fragment newFragment = new CauzeIntroducereFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });

        CauzeEtimologie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getCauzeEtim()==0)globalProgressClass.setCauzeEtim(1);

                Fragment newFragment = new CauzeEtimologieFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        CauzeMareaBritanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getCauzeMB()==0)globalProgressClass.setCauzeMB(1);

                Fragment newFragment = new CauzeMareaBritanieFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        CauzeEuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(globalProgressClass.getCauzeEU()==0)globalProgressClass.setCauzeEU(1);

                Fragment newFragment = new CauzeEuropaFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        return view;
    }



}
