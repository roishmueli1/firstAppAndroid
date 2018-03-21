package com.example.roishmueli.myfirstapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Intent nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.editText3);
        findViewById(R.id.btnPage2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage = new Intent(MainActivity.this, Page2.class);
                startActivity(nextPage);
            }
        });
    }
    public void func(View v) {
        String sms;
        sms = text.getText().toString();

        Toast.makeText(MainActivity.this, sms,  Toast.LENGTH_LONG).show();
        text.setText("");
       // text.setEnabled(false);
    }
}
