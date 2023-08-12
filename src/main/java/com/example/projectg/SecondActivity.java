package com.example.projectg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClickA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    int Wood = 0;

    public void onClickF(View view) {
        Wood = Wood++;
        SharedPreferences preferences =  getSharedPreferences("game", Wood);
        textView3.setText("Рекорд: " + preferences.getInt("textView3",0));

    }
}