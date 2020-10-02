package com.example.danizeul.revind.Invata.Cauze;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.R;


public class CauzeMareaBritanieFragment extends Fragment {

    TextView ButonCauzeMB;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cauze_marea_britanie,container,false);

        ButonCauzeMB = (TextView) view.findViewById(R.id.ButonCauzeMB);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonCauzeMB.setVisibility(View.GONE);
        }

        if(globalProgressClass.getCauzeMB()==2)
        {
            ButonCauzeMB.setVisibility(View.GONE);
        }

        ButonCauzeMB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setCauzeMB(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
