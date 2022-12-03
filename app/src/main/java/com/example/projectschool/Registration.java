package com.example.projectschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Registration extends AppCompatActivity implements OnClickListener {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnReturn = (Button) findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            Intent intent = new Intent(this, LogIn.class);
            startActivity(intent);
            finish();
        } catch(Exception e) {
            Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(this, LogIn.class);
            startActivity(intent);
            finish();
        } catch(Exception e) {}
    }
}