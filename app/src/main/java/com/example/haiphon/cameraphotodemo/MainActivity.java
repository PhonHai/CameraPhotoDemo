package com.example.haiphon.cameraphotodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_photo)
    Button btnPhoto;
    @BindView(R.id.btn_lambuda)
    Button btnLambuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btn_photo)
    public void onClick1(Button btn_photo) {
        Intent intent = new Intent(MainActivity.this, PhotoActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_lambuda)
    public void onClick2(Button btn_lambuda) {
        Intent intent = new Intent(MainActivity.this, LambudaActivity.class);
        startActivity(intent);
    }


}
