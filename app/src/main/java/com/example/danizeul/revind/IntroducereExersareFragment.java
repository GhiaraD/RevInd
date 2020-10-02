package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class IntroducereExersareFragment extends Fragment {

    TextView butonintroducereexersare,textRecord;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_introducere_exersare,container,false);

        butonintroducereexersare = (TextView) view.findViewById(R.id.butonintroexersare);
        textRecord = (TextView) view.findViewById(R.id.TextRecord);

        globalProgressClass = (GlobalProgressClass)getContext().getApplicationContext();

        textRecord.setText("Scor record: "+globalProgressClass.getRecordScor() +" răspunsuri corecte");

        butonintroducereexersare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setTotal(0);
                globalProgressClass.setScor(0);

                Fragment newFragment = new ExerseazaFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        return view;
    }

}
