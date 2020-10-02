package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.danizeul.revind.R.id.ButonAlte1;


public class Alte3Fragment extends Fragment {

    TextView ButonAlte3;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte3,container,false);

        ButonAlte3 = (TextView) view.findViewById(R.id.ButonAlte3);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte3.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart3()==2)
        {
            ButonAlte3.setVisibility(View.GONE);
        }

        ButonAlte3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart3(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
