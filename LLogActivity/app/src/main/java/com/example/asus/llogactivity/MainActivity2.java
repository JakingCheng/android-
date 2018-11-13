package com.example.asus.llogactivity;

/**
 * Created by asus on 2018/4/24.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity  {
    private static final String LIFT_TAG="LogActivity";
   @Override
    protected  void onCreate(Bundle savedInstanceState){
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onCreate");
        super.onCreate(savedInstanceState);
    }
    @Override
    protected  void onDestroy() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onDesory");
        super.onDestroy();
    }
    @Override
    protected void onPause(){
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onPause");
        super.onPause();
    }
    @Override
    protected void onRestart() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onRestart");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onResume");
        super.onResume();
    }
    @Override
    protected void onStop() {
        Log.v(MainActivity.LIFT_TAG,"SecondActivity  ----->onStop");
        super.onStop();
    }
}
