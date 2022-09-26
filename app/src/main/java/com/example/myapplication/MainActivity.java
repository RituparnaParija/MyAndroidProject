package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.username);
        Button btn = (Button) findViewById(R.id.singupbtn);
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String u1 = username.getText().toString();
               Toast.makeText(MainActivity.this,"Username is "+u1,Toast.LENGTH_SHORT).show();

           }
       }
        );

    }
}