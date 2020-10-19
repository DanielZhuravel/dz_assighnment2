package com.example.dz_assighnment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x=0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txtResult);
    }

    public void methodToDo(View view) {
        x++;
        String st = getString(R.string.textOnTextBox);
        tv.setText(st + " " + x);
    }
}