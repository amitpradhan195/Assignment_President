package com.example.president_of_usa.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.president_of_usa.R;

public class activity_dashboard extends AppCompatActivity implements View.OnClickListener {

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
            Intent intent = new Intent(this, activity_InputInfo.class);
            startActivity(intent);
        }

    }
}
