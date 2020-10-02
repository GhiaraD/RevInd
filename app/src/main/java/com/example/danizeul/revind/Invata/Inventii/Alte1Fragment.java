package com.example.danizeul.revind.Invata.Inventii;

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


public class Alte1Fragment extends Fragment {

    TextView ButonAlte1;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte1,container,false);

        ButonAlte1 = (TextView) view.findViewById(R.id.ButonAlte1);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte1.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart1()==2)
        {
            ButonAlte1.setVisibility(View.GONE);
        }

        ButonAlte1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart1(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
