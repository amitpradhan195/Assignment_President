package com.example.usa_presidents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn1= findViewById(R.id.btnPresidents);
        btn2= findViewById(R.id.btnForm);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnPresidents){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this,SpinnerFormActivity.class);
            startActivity(intent);
        }

    }
}
