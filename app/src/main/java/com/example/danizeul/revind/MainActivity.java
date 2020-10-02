package com.example.danizeul.revind;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    GlobalProgressClass globalProgressClass;

    View navigation1,navigation2,navigation3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        globalProgressClass = (GlobalProgressClass) getApplicationContext();

        navigation1 = (View)findViewById(R.id.bottom_navigation_invata);
        navigation2 = (View)findViewById(R.id.bottom_navigation_exerseaza);
        navigation3 = (View)findViewById(R.id.bottom_navigation_maimult);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;




                    switch (item.getItemId())
                    {

                        case R.id.bottom_navigation_invata:
                            globalProgressClass.setCorect(0);
                            selectedFragment = new InvataFragment();
                            navigation1.setBackgroundColor(Color.parseColor("#777777"));
                            navigation2.setBackgroundColor(Color.parseColor("#000000"));
                            navigation3.setBackgroundColor(Color.parseColor("#000000"));

                            break;
                        case R.id.bottom_navigation_exerseaza:
                            globalProgressClass.setScor(0);
                            globalProgressClass.setTotal(0);
                            selectedFragment = new IntroducereExersareFragment();
                            navigation1.setBackgroundColor(Color.parseColor("#000000"));
                            navigation2.setBackgroundColor(Color.parseColor("#777777"));
                            navigation3.setBackgroundColor(Color.parseColor("#000000"));
                            break;

                        case R.id.bottom_navigation_maimult:
                            selectedFragment = new BiografieFragment();
                            navigation1.setBackgroundColor(Color.parseColor("#000000"));
                            navigation2.setBackgroundColor(Color.parseColor("#000000"));
                            navigation3.setBackgroundColor(Color.parseColor("#777777"));
                            break;


                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return false;
                }
            };

}
