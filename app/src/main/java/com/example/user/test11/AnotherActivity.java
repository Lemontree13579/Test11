package com.example.user.test11;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lenovo on 2016/9/3.
 */
public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String modelname = intent.getStringExtra("modelname");
                String threewei = intent.getStringExtra("threewei");


                intent.putExtra("result","模特姓名:"+ modelname + "  三围:" +threewei );

                setResult(0,intent);
                finish();
            }
        });



    }
}
