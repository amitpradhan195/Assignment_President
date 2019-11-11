package com.example.president_of_usa.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.president_of_usa.R;

public class activity_InputInfo extends AppCompatActivity{

    EditText etName,etEmail,etPhone, etage;
    Spinner spinner;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_form);

        final Spinner spinner = findViewById(R.id.spinnerAddress);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.address,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        viewValue();

        Submit.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name, phone, email, address, age;
                name = etName.getText().toString();
                phone = etPhone.getText().toString();
                email = etEmail.getText().toString();
                age = etage.getText().toString();
                address = spinner.getSelectedItem().toString();
                if(name.length()==0 && phone.length()==0 && email.length()==0 && age.length()==0){
                    etName.setError("Enter name");
                    etPhone.setError("Enter contact number");
                    etEmail.setError("Enter email id");
                    etage.setError("Enter your age");
                }
                else if(name.length()==0){
                    etName.setError("Enter name");
                }
                else if(phone.length()==0){
                    etPhone.setError("Enter name");
                }
                else if(email.length()==0){
                    etEmail.setError("Enter name");
                }
                else if(age.length()==0){
                    etage.setError("Enter name");
                }
                else {
                    Intent intentForm = new Intent(activity_InputInfo.this, activity_displayInfo.class);
                    intentForm.putExtra("sendName", name);
                    intentForm.putExtra("sendContact", phone);
                    intentForm.putExtra("sendEmail",email);
                    intentForm.putExtra("sendAge", age);
                    intentForm.putExtra("sendAddress",address);

                    startActivity(intentForm);

                }
            }
        });
    }


    private void viewValue() {
        etName = findViewById(R.id.pName);
        etage = findViewById(R.id.yourAge);
        etPhone = findViewById(R.id.phoneNumber);
        etEmail = findViewById(R.id.Email);
        spinner = findViewById(R.id.spinnerAddress);
        Submit= findViewById(R.id.btnSubmit);
    }
}
