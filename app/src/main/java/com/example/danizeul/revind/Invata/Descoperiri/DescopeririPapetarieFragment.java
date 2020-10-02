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


public class DescopeririPapetarieFragment extends Fragment {

    TextView ButonDescopeririPapetarie;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_papetarie,container,false);

        ButonDescopeririPapetarie = (TextView) view.findViewById(R.id.ButonDescopeririPapetarie);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririPapetarie.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririPapetarie()==2)
        {
            ButonDescopeririPapetarie.setVisibility(View.GONE);
        }

        ButonDescopeririPapetarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririPapetarie(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
