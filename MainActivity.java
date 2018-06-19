package com.example.barluc12.app_nodemcu

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLed1, btnLed2, btnLed3, btnTodos;
    TextView textLdr;
    EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLed1 = (Button) findViewById(R.id.btnLed1);
        btnLed2 = (Button) findViewById(R.id.btnLed2);
        btnLed3 = (Button) findViewById(R.id.btnLed3);
        btnTodos = (Button) findViewById(R.id.btnTodos);

    }
}
