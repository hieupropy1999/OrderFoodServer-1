package com.example.orderfoodserver;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {
    Button btndangnhap;
    TextView txtChao,txtApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        btndangnhap= (FButton)findViewById(R.id.btndangnhap);
        txtChao = (TextView) findViewById(R.id.txtChao);
        txtApp = (TextView)findViewById(R.id.txtApp);

        Typeface typeface = (Typeface) Typeface.createFromAsset(getAssets(),"fonts/NABILA.TTF");
        txtChao.setTypeface(typeface);
        txtApp.setTypeface(typeface);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dangnhap = new Intent(MainActivity.this,Dangnhap.class);
                startActivity(dangnhap);
            }
        });
    }
}
