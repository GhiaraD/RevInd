package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Alte6Fragment extends Fragment {

    TextView ButonAlte6;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte6,container,false);

        ButonAlte6 = (TextView) view.findViewById(R.id.ButonAlte6);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte6.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart6()==2)
        {
            ButonAlte6.setVisibility(View.GONE);
        }

        ButonAlte6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart6(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
