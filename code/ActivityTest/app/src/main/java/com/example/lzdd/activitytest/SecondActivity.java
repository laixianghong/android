package com.example.lzdd.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "Hello Android：Second activity!";
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("extra_data",data);
                Log.d("SecondActivity",data);
                startActivity(intent);
            }
        });
    }
}
