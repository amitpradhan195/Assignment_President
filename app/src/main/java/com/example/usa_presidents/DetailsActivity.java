package com.example.usa_presidents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
     TextView fullName, about;
     CircleImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle('');

        fullName = findViewById(R.id.fullName);
        about =findViewById(R.id.about);
        imgProfile = findViewById(R.id.imgProfile);

        Bundle bundle = getIntent().getExtras();

        //Intent intent = getIntent();
        if(bundle!=null) {
           fullName.setText(bundle.getString("name"));
           about.setText(bundle.getString("about"));
           imgProfile.setImageResource(bundle.getInt("image"));
           
        }


    }
}
