package com.example.danizeul.revind.Invata.Descoperiri;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.R;


public class DescopeririFragment extends Fragment {

    RelativeLayout RDescopeririManufactura, RDescopeririFier, RDescopeririAbur, RDescopeririChimicale, RDescopeririGaz, RDescopeririSticla, RDescopeririPapetarie, RDescopeririAgricultura, RDescopeririMinat, RDescopeririTransport;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri,container,false);

        globalProgressClass = (GlobalProgressClass)getContext().getApplicationContext();

        RDescopeririManufactura = (RelativeLayout) view.findViewById(R.id.DescopeririManufactura);
        RDescopeririFier = (RelativeLayout) view.findViewById(R.id.DescopeririFier);
        RDescopeririAbur = (RelativeLayout) view.findViewById(R.id.DescopeririAbur);
        RDescopeririChimicale = (RelativeLayout) view.findViewById(R.id.DescopeririChimicale);
        RDescopeririGaz = (RelativeLayout) view.findViewById(R.id.DescopeririGaz);
        RDescopeririSticla = (RelativeLayout) view.findViewById(R.id.DescopeririSticla);
        RDescopeririPapetarie = (RelativeLayout) view.findViewById(R.id.DescopeririPapetarie);
        RDescopeririAgricultura = (RelativeLayout) view.findViewById(R.id.DescopeririAgricultura);
        RDescopeririMinat = (RelativeLayout) view.findViewById(R.id.DescopeririMinat);
        RDescopeririTransport = (RelativeLayout) view.findViewById(R.id.DescopeririTransport);

        if(globalProgressClass.getDescopeririManufactura()==1)
        {
            RDescopeririManufactura.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getDescopeririManufactura()==2)
        {
            RDescopeririManufactura.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }


        if(globalProgressClass.getDescopeririFier()==1)
        {
            RDescopeririFier.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getDescopeririFier()==2)
        {
            RDescopeririFier.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getDescopeririAbur()==1)
        {
            RDescopeririAbur.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getDescopeririAbur()==2)
        {
            RDescopeririAbur.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getDescopeririChimicale()==1)
        {
            RDescopeririChimicale.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getDescopeririChimicale()==2)
        {
            RDescopeririChimicale.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getDescopeririGaz()==1)
        {
            RDescopeririGaz.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getDescopeririGaz()==2)
        {
            RDescopeririGaz.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getDescopeririSticla()==1)
        {
            RDescopeririSticla.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getDescopeririSticla()==2)
        {
            RDescopeririSticla.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getDescopeririPapetarie()==1)
        {
            RDescopeririPapetarie.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getDescopeririPapetarie()==2)
        {
            RDescopeririPapetarie.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }

        if(globalProgressClass.getDescopeririAgricultura()==1)
        {
            RDescopeririAgricultura.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getDescopeririAgricultura()==2)
        {
            RDescopeririAgricultura.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getDescopeririMinat()==1)
        {
            RDescopeririMinat.setBackgroundResource(R.drawable.btn_style_inceput_1);
        }
        else if(globalProgressClass.getDescopeririMinat()==2)
        {
            RDescopeririMinat.setBackgroundResource(R.drawable.btn_style_terminat_1);
        }

        if(globalProgressClass.getDescopeririTransport()==1)
        {
            RDescopeririTransport.setBackgroundResource(R.drawable.btn_style_inceput_2);
        }
        else if(globalProgressClass.getDescopeririTransport()==2)
        {
            RDescopeririTransport.setBackgroundResource(R.drawable.btn_style_terminat_2);
        }


        RDescopeririManufactura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririManufactura()==0)globalProgressClass.setDescopeririManufactura(1);

                Fragment newFragment = new DescopeririManufacturaFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });



        RDescopeririFier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririFier()==0)globalProgressClass.setDescopeririFier(1);

                Fragment newFragment = new DescopeririFierFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririAbur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririAbur()==0)globalProgressClass.setDescopeririAbur(1);

                Fragment newFragment = new DescopeririAburFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririChimicale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririChimicale()==0)globalProgressClass.setDescopeririChimicale(1);

                Fragment newFragment = new DescopeririChimicaleFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririGaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririGaz()==0)globalProgressClass.setDescopeririGaz(1);

                Fragment newFragment = new DescopeririGazFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririSticla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririSticla()==0)globalProgressClass.setDescopeririSticla(1);

                Fragment newFragment = new DescopeririSticlaFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririPapetarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririPapetarie()==0)globalProgressClass.setDescopeririPapetarie(1);

                Fragment newFragment = new DescopeririPapetarieFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririAgricultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririAgricultura()==0)globalProgressClass.setDescopeririAgricultura(1);

                Fragment newFragment = new DescopeririAgriculturaFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririMinat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririMinat()==0)globalProgressClass.setDescopeririMinat(1);

                Fragment newFragment = new DescopeririMinatFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        RDescopeririTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getDescopeririTransport()==0)globalProgressClass.setDescopeririTransport(1);

                Fragment newFragment = new DescopeririTransportFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();


                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);


                transaction.commit();


            }
        });


        return view;
    }

}
