package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DescopeririAgriculturaFragment extends Fragment {

    TextView ButonDescopeririAgricultura;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_agricultura,container,false);

        ButonDescopeririAgricultura = (TextView) view.findViewById(R.id.ButonDescopeririAgricultura);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririAgricultura.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririAgricultura()==2)
        {
            ButonDescopeririAgricultura.setVisibility(View.GONE);
        }

        ButonDescopeririAgricultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririAgricultura(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
