package com.example.ilia.deliverygramandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class StartChat extends AppCompatActivity {

    private Button startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_chat);
        startbutton = (Button) findViewById(R.id.start_button);

        startbutton.setOnClickListener(new StartButtonClick());
    }


}
