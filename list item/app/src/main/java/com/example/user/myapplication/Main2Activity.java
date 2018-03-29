package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       ImageView img = findViewById(R.id.imageView);

        Intent intent=getIntent();
        int food=intent.getIntExtra("n",1);
        Log.i("Show food",Integer.toString(food));

        switch (food){

            case 0:
                img.setImageResource(R.drawable.f1);
                break;

            case 1:
                img.setImageResource(R.drawable.f2);
                break;

            case 2:
                img.setImageResource(R.drawable.f3);
                break;

            case 3:
                img.setImageResource(R.drawable.f4);
                break;

            case 4:
                img.setImageResource(R.drawable.f5);
                break;

            default:
                img.setImageResource(R.drawable.ic_launcher_background);
                break;
            }

    }

    public void button(View view){
        Intent i = new Intent();
        i.putExtra("返回",1);
        setResult(RESULT_OK,i);
        finish();
    }


}



