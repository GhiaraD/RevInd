package com.example.danizeul.revind.Invata.Descoperiri;

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


public class DescopeririAburFragment extends Fragment {

    TextView ButonDescopeririAbur;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_abur,container,false);

        ButonDescopeririAbur = (TextView) view.findViewById(R.id.ButonDescopeririAbur);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririAbur.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririAbur()==2)
        {
            ButonDescopeririAbur.setVisibility(View.GONE);
        }

        ButonDescopeririAbur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririAbur(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
