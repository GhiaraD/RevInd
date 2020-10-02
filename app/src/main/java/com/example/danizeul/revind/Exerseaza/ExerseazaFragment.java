package com.example.danizeul.revind.Exerseaza;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.R;

import java.util.Random;


public class ExerseazaFragment extends Fragment {

    TextView Intrebare,Varianta1,Varianta2,Varianta3,Varianta4;
    RelativeLayout V1,V2,V3,V4;

    LinearLayout FundalExerseaza;

    String Intrebari[]={"În ce secol a început Revoluția Industrială ?",     "Când a fost folosit prima oară temenul de Revoluție Industrială?",     "Absența taxelor de trecere din Marea Britanie a a avut un rol important în declanșarea Revoluției Industriale. După ce secol dispăruseră acestea ?"          ,"Care dintre următoarele invenții îi aparțin lui Karl Drais?"        ,"Cine a inventat primul război de țesut mecanic ?",      "În ce an s-a terminat construcția primului pod de fier din lume, The Iron Bridge, din Shropshire, Anglia?",       "Care a fost principalul producător de sticlă începând cu Revoluția Industrială?",     "Câți ani a durat construcția Tunelului Thames?",     "În ce an a brevetat Nicholas Louis Robert prima mașină de hârtie ?",    "Care dintre următoarele este o invenție a lui Andrew Meikle?",     "Cu cine a colaborat James Watt pentru perfecționarea motorului său ?",   "Cum se mai numește motorul lui Thomas Newcomen construit în 1712?"};

    String Raspunsuri[]={"al XVIII-lea"     ,"6 iulie 1799",    "al XV-lea"       ,"Amândouă"      ,"Edmund Cartwright",      "1781",      "Chance Brothers",     "19",     "1789",     "Batoza de treierat",   "Matthew Boulton"  , "Motorul atmosferic"};

    String Gresit[]={"al XVII-lea","al XIX-lea","al XVI-lea"   ,   "1 decembrie 1918","3 ianuarie 1837","6 iunie 1799"   ,"al XVI-lea","al XIV-lea","al XVII-lea",    "Drezina","Bicicleta","Niciuna"  ,  "Nikola Tesla","James Watt","Claude de Jouffroy",   "1780","1785","1813",      "Frații Montgolfier","Edmund Cartwright","Benjamin Franklin",        "22","13","36",       "1813","1785","1793",   "Lampa cu petrol","Balonul cu aer cald","Motorul cu aburi",    "Andrew Meikle","Thomas Edison","Claude de Jouffroy",    "Motorul cilindric","Motorul rotativ","Motorul automat"};

    String Sugestii[]={"CauzeIntroducere", "CauzeEtimologie", "CauzeMB","CauzeEU","DescopeririManufactura","DescopeririFier","DescopeririSticla","DescopeririGaz","DescopeririPapetarie","DescopeririAgricultura", "DescopeririAbur","DescopeririAbur"};

    int crt,poz;

    GlobalProgressClass globalProgressClass;

    TextView ExerseazaScor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exerseaza,container,false);

        globalProgressClass = (GlobalProgressClass)getContext().getApplicationContext();

        FundalExerseaza = (LinearLayout) view.findViewById(R.id.ExerseazaFundal);

        Intrebare = (TextView) view.findViewById(R.id.IntrebareText);
        Varianta1 = (TextView) view.findViewById(R.id.Varianta1Text);
        Varianta2 = (TextView) view.findViewById(R.id.Varianta2Text);
        Varianta3 = (TextView) view.findViewById(R.id.Varianta3Text);
        Varianta4 = (TextView) view.findViewById(R.id.Varianta4Text);

        ExerseazaScor = (TextView) view.findViewById(R.id.ExerseazaScor);

        ExerseazaScor.setText("Scor: "+globalProgressClass.getScor());

        V1 = (RelativeLayout) view.findViewById(R.id.Varianta1);
        V2 = (RelativeLayout) view.findViewById(R.id.Varianta2);
        V3 = (RelativeLayout) view.findViewById(R.id.Varianta3);
        V4 = (RelativeLayout) view.findViewById(R.id.Varianta4);

        Random r = new Random();
        crt = r.nextInt(12);

        Intrebare.setText(Intrebari[crt]);

        globalProgressClass.setSugestia(Sugestii[crt]);

        poz = r.nextInt(4);

        if(poz==0)
        {
            Varianta1.setText(Raspunsuri[crt]);

            Varianta2.setText(Gresit[crt*3]);
            Varianta3.setText(Gresit[crt*3+1]);
            Varianta4.setText(Gresit[crt*3+2]);

        }
        else if(poz==1)
        {
            Varianta2.setText(Raspunsuri[crt]);

            Varianta1.setText(Gresit[crt*3]);
            Varianta3.setText(Gresit[crt*3+1]);
            Varianta4.setText(Gresit[crt*3+2]);

        }
        else if(poz==2)
        {
            Varianta3.setText(Raspunsuri[crt]);

            Varianta2.setText(Gresit[crt*3]);
            Varianta1.setText(Gresit[crt*3+1]);
            Varianta4.setText(Gresit[crt*3+2]);

        }
        else if(poz==3)
        {
            Varianta4.setText(Raspunsuri[crt]);

            Varianta2.setText(Gresit[crt*3]);
            Varianta3.setText(Gresit[crt*3+1]);
            Varianta1.setText(Gresit[crt*3+2]);
        }

        V1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(poz==0)
                {
                    V1.setBackgroundResource(R.drawable.btn_style_corect);
                    globalProgressClass.setCorect(1);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);
                    globalProgressClass.setScor(globalProgressClass.getScor()+1);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_verde);
                }
                else
                {
                    V1.setBackgroundResource(R.drawable.btn_style_gresit);
                    globalProgressClass.setCorect(0);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_rosu);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);

                    if(poz==1)
                        V2.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==2)
                        V3.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==3)
                        V4.setBackgroundResource(R.drawable.btn_style_corect);

                }

                V1.postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Fragment newFragment = new FeedbackRaspunsFragment();

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.fragment_container, newFragment);
                        transaction.addToBackStack(null);


                        transaction.commit();

                    }
                }, 1500);



            }
        });

        V2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(poz==1)
                {
                    V2.setBackgroundResource(R.drawable.btn_style_corect);
                    globalProgressClass.setCorect(1);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_verde);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);
                    globalProgressClass.setScor(globalProgressClass.getScor()+1);
                }
                else
                {
                    V2.setBackgroundResource(R.drawable.btn_style_gresit);
                    globalProgressClass.setCorect(0);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_rosu);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);

                    if(poz==0)
                        V1.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==2)
                        V3.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==3)
                        V4.setBackgroundResource(R.drawable.btn_style_corect);

                }

                V2.postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Fragment newFragment = new FeedbackRaspunsFragment();

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();


                        transaction.replace(R.id.fragment_container, newFragment);
                        transaction.addToBackStack(null);


                        transaction.commit();

                    }
                }, 1500);

            }
        });

        V3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(poz==2)
                {
                    V3.setBackgroundResource(R.drawable.btn_style_corect);
                    globalProgressClass.setCorect(1);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_verde);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);
                    globalProgressClass.setScor(globalProgressClass.getScor()+1);
                }
                else
                {
                    V3.setBackgroundResource(R.drawable.btn_style_gresit);
                    globalProgressClass.setCorect(0);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_rosu);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);

                    if(poz==1)
                        V2.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==0)
                        V1.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==3)
                        V4.setBackgroundResource(R.drawable.btn_style_corect);

                }

                V3.postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Fragment newFragment = new FeedbackRaspunsFragment();

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.fragment_container, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();

                    }
                }, 1500);

            }
        });

        V4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(poz==3)
                {
                    V4.setBackgroundResource(R.drawable.btn_style_corect);
                    globalProgressClass.setCorect(1);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_verde);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);
                    globalProgressClass.setScor(globalProgressClass.getScor()+1);
                }
                else
                {
                    V4.setBackgroundResource(R.drawable.btn_style_gresit);
                    globalProgressClass.setCorect(0);
                    FundalExerseaza.setBackgroundResource(R.drawable.fundal_style_rosu);
                    globalProgressClass.setTotal(globalProgressClass.getTotal()+1);

                    if(poz==1)
                        V2.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==2)
                        V3.setBackgroundResource(R.drawable.btn_style_corect);

                    else if(poz==0)
                        V1.setBackgroundResource(R.drawable.btn_style_corect);

                }

                V4.postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        Fragment newFragment = new FeedbackRaspunsFragment();

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.fragment_container, newFragment);
                        transaction.addToBackStack(null);

                        transaction.commit();

                    }
                }, 1500);

            }
        });

        return view;
    }

}
