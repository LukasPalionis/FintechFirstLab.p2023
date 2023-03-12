package com.example.fintechfirstlabp2023;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TvMain = findViewById(R.id.TvMain);
    }

    public void OnBtnClick(View view) {
        this.TvMain.setText (getString(R.string.changed_lable_caption));
    }
    public void onBtnColorClick(View view) {
        TextView tvMain = (TextView) findViewById(R.id.TvMain);
        tvMain.setTextColor(Color.parseColor("#FF0000"));
    }
}