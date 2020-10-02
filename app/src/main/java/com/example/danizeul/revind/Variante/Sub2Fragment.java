package com.example.danizeul.revind.Variante;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.danizeul.revind.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;


public class Sub2Fragment extends Fragment {

    PDFView documentul2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sub2,container,false);

        documentul2 = (PDFView) view.findViewById(R.id.doc2);

        documentul2.fromAsset("Subiectul-II.pdf")
                .enableAntialiasing(true)
                .load();

        return view;
    }

}
