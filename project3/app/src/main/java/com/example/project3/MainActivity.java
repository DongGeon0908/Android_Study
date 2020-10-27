package com.example.project3;


import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.ViewFlipper;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    TextView text1, text2, text3, text4;
    RadioGroup rg1, rg2;
    RadioButton rb1, rb2, rb3, rb4;
    Button btn1, btn2;

    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("김동건 201658109");

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        viewFlipper = findViewById(R.id.viewFlipper);

        viewFlipper.setFlipInterval(1000);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1").setIndicator("이름/학번");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2").setIndicator("설문");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3").setIndicator("사진");
        tab3.setContent(R.id.tab3);
        tabHost.addTab(tab3);
        tabHost.setCurrentTab(0);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.startFlipping();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewFlipper.stopFlipping();

            }
        });

    }
}