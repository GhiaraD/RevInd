package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Alte5Fragment extends Fragment {
    TextView ButonAlte5;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte5,container,false);

        ButonAlte5 = (TextView) view.findViewById(R.id.ButonAlte5);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte5.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart5()==2)
        {
            ButonAlte5.setVisibility(View.GONE);
        }

        ButonAlte5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart5(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
