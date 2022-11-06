package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v) {
        v.setEnabled(false);
        Button btn = (Button) v;
        btn.setText("Disabled");
    }
//    public void handleText(View v) {
//        TextView input = findViewById(R.id.editText);
//        TextView output = (TextView)findViewById(R.id.output);
//
//        String result = input.getText().toString();
//        //Log.v("info", result);
//        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
//        output.setText(result);
//    }
    public void launchSettings(View v) {
        //launch new activity
        Intent i = new Intent(this, SettingsActivity.class);
        i.putExtra("COOL", "Hello");
        startActivity(i);
    }

}