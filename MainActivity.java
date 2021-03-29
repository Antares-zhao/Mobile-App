package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickCount = clickCount + 1;
                Toast.makeText(MainActivity.this,"Click time is "+clickCount,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}