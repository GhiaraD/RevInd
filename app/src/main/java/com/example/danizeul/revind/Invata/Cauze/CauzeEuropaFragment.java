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


public class CauzeEuropaFragment extends Fragment {

    TextView ButonCauzeEU;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cauze_europa,container,false);

        ButonCauzeEU = (TextView) view.findViewById(R.id.ButonCauzeEU);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonCauzeEU.setVisibility(View.GONE);
        }

        if(globalProgressClass.getCauzeEU()==2)
        {
            ButonCauzeEU.setVisibility(View.GONE);
        }

        ButonCauzeEU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setCauzeEU(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
