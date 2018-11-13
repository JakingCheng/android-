package com.example.asus.llogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LLogDemo extends AppCompatActivity {
    private static final String ACTIVITY_TAG="LLogDemo";
    private Button button;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.v(LLogDemo.ACTIVITY_TAG,"This is verbose");
                Log.v(LLogDemo.ACTIVITY_TAG,"This is Debug");
                Log.v(LLogDemo.ACTIVITY_TAG,"This is Info");
                Log.v(LLogDemo.ACTIVITY_TAG,"This is Warn");
                Log.v(LLogDemo.ACTIVITY_TAG,"This is error");
            }
        });
    }
}
