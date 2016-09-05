package com.example.administrator.testapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends BaseActivity
{
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Text","firstActivity");
        setContentView(R.layout.activity_first);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });

    }
    public void onActivityResult(int requestCode,int resultCode,Intent data )
    {
        switch (requestCode)
        {
            case 1:
                if(resultCode==RESULT_OK)
                {
                    String data_return =data.getStringExtra("retutn ");
                    Log.d("FirstActivity",data_return);

                }
                break;
            default:
        }


    }


}