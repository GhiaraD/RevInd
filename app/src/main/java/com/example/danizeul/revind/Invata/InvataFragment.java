package com.example.danizeul.revind.Invata;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.danizeul.revind.Invata.Cauze.CauzeFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririFragment;
import com.example.danizeul.revind.EfectFragment;
import com.example.danizeul.revind.Invata.Inventii.AlteFragment;
import com.example.danizeul.revind.R;


public class InvataFragment extends Fragment {

    RelativeLayout cauzeImage;
    RelativeLayout descImage;
    RelativeLayout efecteImage;
    RelativeLayout alteImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_invata,container,false);

        cauzeImage = (RelativeLayout) view.findViewById(R.id.cauze);
        descImage = (RelativeLayout) view.findViewById(R.id.desc);
        efecteImage = (RelativeLayout) view.findViewById(R.id.efecte);
        alteImage = (RelativeLayout) view.findViewById(R.id.alte);

        cauzeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new CauzeFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();
            }
        });

        descImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new DescopeririFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        efecteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new EfectFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        alteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment newFragment = new AlteFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();

            }
        });

        return view;
    }

}
