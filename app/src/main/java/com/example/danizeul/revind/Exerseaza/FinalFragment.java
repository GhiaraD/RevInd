package com.example.danizeul.revind.Exerseaza;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.danizeul.revind.helper.GlobalProgressClass;
import com.example.danizeul.revind.R;


public class FinalFragment extends Fragment {


    GlobalProgressClass globalProgressClass;

    LinearLayout FinalFundal;

    TextView FinalMesajMare, FinalMesaj;

    RelativeLayout FinalButon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_final,container,false);

        FinalFundal = (LinearLayout) view.findViewById(R.id.FinalFundal);

        globalProgressClass = (GlobalProgressClass)getContext().getApplicationContext();

        FinalMesajMare = (TextView) view.findViewById(R.id.FinalMesajMare);
        FinalMesaj = (TextView) view.findViewById(R.id.FinalMesajNumar);
        FinalButon = (RelativeLayout) view.findViewById(R.id.butonfinal);

        if (globalProgressClass.getScor()<=1)
        {
            FinalFundal.setBackgroundResource(R.drawable.fundal_style_rosu);
            FinalMesaj.setText("Mai citeste o data lectiile!");
            FinalButon.setBackgroundResource(R.drawable.btn_style_gresit);
            FinalMesajMare.setText("Insuficient");
        }
        else if(globalProgressClass.getScor()==2)
        {
            FinalFundal.setBackgroundResource(R.drawable.fundal_style_galben);
        }
        else
        {
            FinalFundal.setBackgroundResource(R.drawable.fundal_style_verde);
        }


        return view;
    }
}
