package com.example.buttonclicker;

import android.os.Bundle;

import  android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private Button buttonDisable;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonDisable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonDisable.setEnabled(false);
            }
        });
    }
}