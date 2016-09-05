package com.example.administrator.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 *
 *
 * Created by Administrator on 2016/9/2.
 */
public class BaseActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("Text",getClass().getSimpleName());



    }
}
