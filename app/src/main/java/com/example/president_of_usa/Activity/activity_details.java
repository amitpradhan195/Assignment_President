package com.example.president_of_usa.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.president_of_usa.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class activity_details extends AppCompatActivity {
     TextView fullName, about;
     CircleImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ActionBar name = getSupportActionBar();


        fullName = findViewById(R.id.fullName);
        about =findViewById(R.id.about);
        imgProfile = findViewById(R.id.imgProfile);


        Bundle bundle = getIntent().getExtras();

        //Intent intent = getIntent();
        if(bundle!=null) {
           fullName.setText(bundle.getString("name"));
           about.setText(bundle.getString("about"));
           imgProfile.setImageResource(bundle.getInt("image"));
           name.setTitle(fullName.getText().toString());
        }


    }
}
