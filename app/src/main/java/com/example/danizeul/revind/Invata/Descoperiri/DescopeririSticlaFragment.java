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


public class DescopeririSticlaFragment extends Fragment {

    TextView ButonDescopeririSticla;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_sticla,container,false);

        ButonDescopeririSticla = (TextView) view.findViewById(R.id.ButonDescopeririSticla);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririSticla.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririSticla()==2)
        {
            ButonDescopeririSticla.setVisibility(View.GONE);
        }

        ButonDescopeririSticla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririSticla(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
