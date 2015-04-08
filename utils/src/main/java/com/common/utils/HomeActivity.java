package com.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class HomeActivity extends Activity {

    Context mContext;
    Activity mActivity;
    ListView sdkFunctionalityList;
    Button btnDemo, btnCodeSnip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = HomeActivity.this;
        mActivity = HomeActivity.this;

        btnDemo = (Button) findViewById(R.id.btnDemo);
        btnCodeSnip = (Button) findViewById(R.id.btnCodeSnip);

        btnDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intdemo = new Intent(mContext, MainActivity.class);
                startActivity(intdemo);

            }
        });


        btnCodeSnip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intcode = new Intent(mContext, CodeSnippestHomeActivity.class);
                startActivity(intcode);
            }
        });
    }

}
