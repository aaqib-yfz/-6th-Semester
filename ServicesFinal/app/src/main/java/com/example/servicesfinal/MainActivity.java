package com.example.servicesfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startServiceBtn = (Button) findViewById(R.id.startBtn);
        Button stopServiceBtn = (Button) findViewById(R.id.stopBtn);

        startServiceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    startMyService();
            }
        });

        stopServiceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                stopMyService();
            }
        });

    }
        public void startMyService(){
            Intent serviceIntent =  new Intent(this,myService.class);
            startService(serviceIntent);
        }
        public void stopMyService(){
            Intent serviceIntent = new Intent(this,myService.class);
            stopService(serviceIntent);

        }
}







