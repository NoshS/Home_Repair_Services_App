package com.blufloapps.home_repair_services_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateAccount extends AppCompatActivity {

    public EditText email;
    public EditText pass;
    public EditText username;
    public RadioGroup user;
    public Button createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        //Select the boxes
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        username = (EditText) findViewById(R.id.username);
        user = (RadioGroup) findViewById(R.id.user);
        createAccount = (Button) findViewById(R.id.createAccount);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");


        createAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //createAccount();
            }
        });
    }

    /* public void createAccount() {
        //Store the user's email, pass, username, and type of account.
        String e = email.getText().toString();
        String p = pass.getText().toString();


    } */


}
