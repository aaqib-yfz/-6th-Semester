package com.example.practice_layouts_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.MotionLabel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.first_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            int a = 0;
            @Override
            public void onClick(View view) {
                a+=1;
                TextView txt = (TextView) findViewById(R.id.txt_first);
                txt.setText(String.valueOf(a));
            }
        });



    }


}


