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


public class Alte4Fragment extends Fragment {

    TextView ButonAlte4;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte4,container,false);

        ButonAlte4 = (TextView) view.findViewById(R.id.ButonAlte4);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte4.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart4()==2)
        {
            ButonAlte4.setVisibility(View.GONE);
        }

        ButonAlte4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart4(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
