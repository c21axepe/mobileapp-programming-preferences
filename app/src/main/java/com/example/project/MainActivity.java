package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView text_name;
    EditText edit_name;
    SharedPreferences preferences;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text_name = findViewById(R.id.text_name);

        preferences = getSharedPreferences("Axel", MODE_PRIVATE);

        button = findViewById(R.id.prefButton);
        edit_name = findViewById(R.id.preftext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getIntent()
            }
        });


        }


    @Override
    protected void onResume() {
        super.onResume();

        String name = preferences.getString("name", "cant get name");
        text_name.setText(name);
    }
}
