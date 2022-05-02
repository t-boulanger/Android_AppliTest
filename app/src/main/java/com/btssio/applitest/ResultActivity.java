package com.btssio.applitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvMonResult;
    private String monResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvMonResult = (TextView) findViewById(R.id.tvMonResult);

        Intent intent = getIntent();
        monResult = "Bonjour, vos infos :";
        monResult += "\nNom : "+intent.getStringExtra("nom");
        monResult += "\nChoix : "+intent.getStringExtra("choix");
        tvMonResult.setText(monResult);

    }
}