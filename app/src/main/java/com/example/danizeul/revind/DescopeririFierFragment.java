package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DescopeririFierFragment extends Fragment {

    TextView ButonDescopeririFier;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_fier,container,false);

        ButonDescopeririFier = (TextView) view.findViewById(R.id.ButonDescopeririFier);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririFier.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririFier()==2)
        {
            ButonDescopeririFier.setVisibility(View.GONE);
        }

        ButonDescopeririFier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririFier(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
