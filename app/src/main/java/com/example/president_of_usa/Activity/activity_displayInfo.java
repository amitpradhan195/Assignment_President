package com.example.president_of_usa.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.president_of_usa.R;

public class activity_displayInfo extends AppCompatActivity {

    TextView tv_name,tv_age, tv_contact,tv_email,tv_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_display);

        tv_name = findViewById(R.id.yName);
        tv_age = findViewById(R.id.yAge);
        tv_contact = findViewById(R.id.pNumber);
        tv_email = findViewById(R.id.email);
        tv_address = findViewById(R.id.address);

        Bundle bundleList = getIntent().getExtras();
        if(bundleList != null){
            tv_name.setText(bundleList.getString("sendName"));
            tv_age.setText(bundleList.getString("sendAge"));
            tv_contact.setText(bundleList.getString("sendContact"));
            tv_email.setText(bundleList.getString("sendEmail"));
            tv_address.setText(bundleList.getString("sendAddress"));

        }
        else
        {
            Toast.makeText(this, "Data not Found", Toast.LENGTH_SHORT).show();
        }
    }
}
