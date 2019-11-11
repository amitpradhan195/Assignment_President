package com.example.usa_presidents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SpinnerDisplayActivity extends AppCompatActivity {

    TextView tvName,tvPhone,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_display);
    }
}
