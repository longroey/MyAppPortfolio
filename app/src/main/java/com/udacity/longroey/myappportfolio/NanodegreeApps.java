package com.udacity.longroey.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NanodegreeApps extends AppCompatActivity implements View.OnClickListener {
    private Button mPopularBtn, mStockBtn, mBuildBtn, mMakeBtn, mGoBtn, mCapstoneBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nanodegree_apps);
        mBuildBtn = (Button) findViewById(R.id.build_btn);
        mCapstoneBtn = (Button) findViewById(R.id.capstone_btn);
        mGoBtn = (Button) findViewById(R.id.go_btn);
        mMakeBtn = (Button) findViewById(R.id.make_btn);
        mPopularBtn = (Button) findViewById(R.id.popular_btn);
        mStockBtn = (Button) findViewById(R.id.stock_btn);

        mBuildBtn.setOnClickListener(this);
        mCapstoneBtn.setOnClickListener(this);
        mGoBtn.setOnClickListener(this);
        mMakeBtn.setOnClickListener(this);
        mPopularBtn.setOnClickListener(this);
        mStockBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(NanodegreeApps.this, "This button will launch my " + ((Button) view).getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT).show();
    }
}