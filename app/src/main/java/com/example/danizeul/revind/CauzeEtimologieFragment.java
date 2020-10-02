package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CauzeEtimologieFragment extends Fragment {

    TextView butoncauzeetimologie;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cauze_etimologie,container,false);

        butoncauzeetimologie = (TextView) view.findViewById(R.id.ButonCauzeEtimologie);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            butoncauzeetimologie.setVisibility(View.GONE);
        }

        if(globalProgressClass.getCauzeEtim()==2)
        {
            butoncauzeetimologie.setVisibility(View.GONE);
        }

        butoncauzeetimologie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setCauzeEtim(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
