package com.blufloapps.home_repair_services_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = (Button) findViewById(R.id.signIn);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }


    public void signUp() {
        Intent intent;
        intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }

}
