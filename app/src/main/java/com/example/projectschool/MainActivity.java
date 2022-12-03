package com.example.projectschool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextInputEditText tfAccName, tfPass;

    AppCompatButton btnSign;

    Button btnGoRegistr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoRegistr = (Button) findViewById(R.id.btnGoRegistr);
        btnGoRegistr.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
        finish();
    }

}