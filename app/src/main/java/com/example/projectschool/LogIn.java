package com.example.projectschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    Button btnGoRegistr;
    Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btnGoRegistr = (Button) findViewById(R.id.btnGoRegistr);
        btnGoRegistr.setOnClickListener(this);

        btnSign = (Button) findViewById(R.id.btnSign);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LogIn.this, NavPage.class);
                startActivity(intent2);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent1 = new Intent(this, Registration.class);
        startActivity(intent1);
        finish();
    }
}