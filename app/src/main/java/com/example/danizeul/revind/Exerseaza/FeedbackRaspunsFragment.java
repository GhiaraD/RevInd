package com.example.danizeul.revind.Exerseaza;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.danizeul.revind.Invata.Cauze.CauzeEtimologieFragment;
import com.example.danizeul.revind.Invata.Cauze.CauzeIntroducereFragment;
import com.example.danizeul.revind.Invata.Cauze.CauzeMareaBritanieFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririAburFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririAgriculturaFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririFierFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririGazFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririManufacturaFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririPapetarieFragment;
import com.example.danizeul.revind.Invata.Descoperiri.DescopeririSticlaFragment;
import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.Invata.Inventii.Alte2Fragment;
import com.example.danizeul.revind.R;


public class FeedbackRaspunsFragment extends Fragment {

    LinearLayout FeedbackFundal;

    ImageView FeedbackImagine;

    GlobalProgressClass globalProgressClass;

    TextView FeedbackText,FeedbackStats,FeedbackContinua,FeedbackInvata;

    String s;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback_raspuns,container,false);

        FeedbackFundal = (LinearLayout) view.findViewById(R.id.FeedbackFundal);
        FeedbackImagine = (ImageView) view.findViewById(R.id.FeedbackImagine);

        FeedbackText = (TextView) view.findViewById(R.id.FeedbackText);
        FeedbackStats = (TextView) view.findViewById(R.id.FeedbackStats);
        FeedbackContinua = (TextView) view.findViewById(R.id.FeedbackContinua);
        FeedbackInvata = (TextView) view.findViewById(R.id.FeedbackInvata);

        globalProgressClass = (GlobalProgressClass)getContext().getApplicationContext();

        if (globalProgressClass.getScor()>globalProgressClass.getRecordScor())
        {
                globalProgressClass.setRecord( (globalProgressClass.getScor()*100)/globalProgressClass.getTotal() );
                globalProgressClass.setRecordScor(globalProgressClass.getScor());
                globalProgressClass.setRecordTotal(globalProgressClass.getTotal());


        }

        if(globalProgressClass.getCorect()==0)
        {
            FeedbackFundal.setBackgroundResource(R.drawable.fundal_style_rosu);
            FeedbackImagine.setImageResource(R.drawable.semn_gresit);
            FeedbackText.setText("Răspuns gresit !");
            FeedbackContinua.setVisibility(View.GONE);
            FeedbackInvata.setVisibility(View.VISIBLE);
            FeedbackStats.setText("Ai răspuns corect la "+globalProgressClass.getScor()+" întrebări !");

            s = globalProgressClass.getSugestia();

        }
        else if(globalProgressClass.getCorect()==2)
        {

            FeedbackFundal.setBackgroundResource(R.drawable.fundal_style_galben);
            FeedbackImagine.setImageResource(R.drawable.fatazambareata);
            FeedbackText.setText("Fii mai atent data viitoare!");
            FeedbackContinua.setVisibility(View.VISIBLE);
            FeedbackInvata.setVisibility(View.GONE);
            FeedbackContinua.setText("Din nou");
            FeedbackStats.setText("Ai răspuns corect la "+globalProgressClass.getScor()+" întrebări !");

        }

        if(globalProgressClass.getCorect()==1)FeedbackStats.setText("Până acum ai răspuns corect la "+globalProgressClass.getScor()+" întrebări !");

        FeedbackContinua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(globalProgressClass.getCorect()==2)
                {
                    globalProgressClass.setScor(0);
                    globalProgressClass.setTotal(0);
                }
                getFragmentManager().popBackStackImmediate();

            }
        });

        FeedbackInvata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(s.compareTo("CauzeIntroducere")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new CauzeIntroducereFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("CauzeEtimologie")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new CauzeEtimologieFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("CauzeMB")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new CauzeMareaBritanieFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("CauzeEU")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new Alte2Fragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririManufactura")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririManufacturaFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririFier")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririFierFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririSticla")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririSticlaFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririGaz")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririGazFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririPapetarie")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririPapetarieFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririAgricultura")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririAgriculturaFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }
                else if(s.compareTo("DescopeririAbur")==0)
                {

                    globalProgressClass.setCorect(2);

                    Fragment newFragment = new DescopeririAburFragment();

                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    transaction.replace(R.id.fragment_container, newFragment);
                    transaction.addToBackStack(null);


                    transaction.commit();

                }


            }
        });

        return view;
    }


}
