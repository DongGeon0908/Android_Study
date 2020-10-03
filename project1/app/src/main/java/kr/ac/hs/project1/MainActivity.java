package kr.ac.hs.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3, text4;
    RadioGroup rg1, rg2;
    RadioButton rb1, rb2, rb3, rb4;
    ImageView img;
    Button btn;
    int[] data = new int[3];
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("자기 소개 앱");

        int i = 0;
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

        img = findViewById(R.id.img);

        btn = findViewById(R.id.btn);


        data[0] = R.drawable.d1;
        data[1] = R.drawable.d2;
        data[2] = R.drawable.d3;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt != 2) {
                    cnt++;
                    img.setImageResource(data[cnt]);
                } else {
                    cnt = 0;
                    img.setImageResource(data[cnt]);
                }


            }
        });


    }
}