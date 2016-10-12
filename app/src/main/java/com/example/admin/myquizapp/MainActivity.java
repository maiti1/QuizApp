package com.example.admin.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextActivity(View view)
    {
        Intent next = new Intent(this,NextActivity.class);
        startActivity(next);
    }
    public void generalActivity(View view)
    {
        Intent next = new Intent(this,GeneralQuestions.class);
        startActivity(next);
    }
    public void quitQuiz(View view)
    {
        finish();
        Toast.makeText(MainActivity.this, "Click again to exit", Toast.LENGTH_SHORT).show();

    }

}
