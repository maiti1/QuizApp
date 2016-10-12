package com.example.admin.myquizapp;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NextActivity extends Activity implements View.OnClickListener {

    //declaration of the variables to be used
    private Button results1;
    private RadioGroup answer,resultss,question3,question4,question5;
    private RadioButton input,monitor,binary,logical,allbove;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //this view is for the Radio buttons
        input = (RadioButton)findViewById(R.id.input_devices);
        monitor = (RadioButton)findViewById(R.id.monitor);
        binary = (RadioButton)findViewById(R.id.binary);
        logical = (RadioButton)findViewById(R.id.logical);
        allbove = (RadioButton)findViewById(R.id.all_above1);

        //this view is for the Radio groups
        answer = (RadioGroup)findViewById(R.id.answer);
        resultss = (RadioGroup)findViewById(R.id.results);
        question3 = (RadioGroup)findViewById(R.id.question3);
        question4 = (RadioGroup)findViewById(R.id.question4);
        question5 = (RadioGroup)findViewById(R.id.question5);

        //this view is for the button
        results1 = (Button)findViewById(R.id.results1);

        //set the button onclick
        results1.setOnClickListener(this);



    }

    //this method will take you back to the main page
    public void exit(View view)
    {
        Intent exits = new Intent(this,MainActivity.class);
        startActivity(exits);
        finish();
    }

    @Override
    public void onClick(View view) {
        int number = 0;
        int total = 5;

        if(input.isChecked())
        {
            number += 1;
        }
        if(monitor.isChecked())
        {
            number += 1;
        }
        if(logical.isChecked())
        {
            number += 1;
        }
        if(binary.isChecked())
        {
            number += 1;
        }
        if(allbove.isChecked())
        {
            number += 1;
        }

        String message = "";

        if(number < 3)
        {
            message = "You had failed try again!!";
        }
        else
        {
            message = "Congratulations you passed well done!!";
        }

        results = (TextView)findViewById(R.id.result);
        results.setText(""+message);
    }
    //this method will clear everything an allow the user to retry the quiz
    public void retry(View view)
    {
        answer.clearCheck();
        resultss.clearCheck();
        question3.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        results.setText("");
    }
}
