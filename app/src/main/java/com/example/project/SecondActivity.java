package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    TextView text_name;
    EditText edit_name;
    SharedPreferences preferences;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        text_name = findViewById(R.id.text_name);

        preferences = getSharedPreferences("Axel", MODE_PRIVATE);

        button = findViewById(R.id.prefButton);
        edit_name = findViewById(R.id.preftext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", edit_name.getText().toString());
                editor.apply();
            }
        });


    }
}
