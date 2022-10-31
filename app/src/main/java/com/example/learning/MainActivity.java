package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v) {
        View view = findViewById(R.id.btn1);
        view.setEnabled(false);
        Button btn = (Button) view;
        btn.setText("Disabled");
    }
}