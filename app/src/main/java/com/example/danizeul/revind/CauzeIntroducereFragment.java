package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CauzeIntroducereFragment extends Fragment {

    TextView butoncauzeintroducere;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cauze_introducere,container,false);

        butoncauzeintroducere = (TextView) view.findViewById(R.id.ButonCauzeIntroducere);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            butoncauzeintroducere.setVisibility(View.GONE);
        }

        if(globalProgressClass.getCauzeIntro()==2)
        {
            butoncauzeintroducere.setVisibility(View.GONE);
        }

        butoncauzeintroducere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setCauzeIntro(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
