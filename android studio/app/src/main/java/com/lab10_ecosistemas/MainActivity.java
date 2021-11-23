package com.lab10_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.InetAddress;

public class MainActivity extends AppCompatActivity {

    private TextView titleLogin;
    private EditText inputUsername;
    private Button bnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleLogin = findViewById(R.id.titleLogin);
        inputUsername = findViewById(R.id.inputUsername);
        bnEnter = findViewById(R.id.bnEnter);

        bnEnter.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this, ListViewer.class);
                    startActivity(i);
                    finish();
                }
        );
    }
}