package com.example.admin.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class GeneralQuestions extends AppCompatActivity implements View.OnClickListener {

    //declaration of the variables to be used
    private RadioGroup question1,question2,question33,question44,question55;
    private TextView score;
    private RadioButton shaba,years27,yr2001,mandela,fnb;
    private Button showScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_questions);

        //this is for the view of Radio groups
        question1 = (RadioGroup)findViewById(R.id.question1);
        question2 = (RadioGroup)findViewById(R.id.question2);
        question33 = (RadioGroup)findViewById(R.id.question33);
        question44 = (RadioGroup)findViewById(R.id.question44);
        question55 = (RadioGroup)findViewById(R.id.question55);

        //this is for the view of Radio Buttons
        shaba = (RadioButton)findViewById(R.id.shaba);
        years27 = (RadioButton)findViewById(R.id.yrs27);
        yr2001 = (RadioButton)findViewById(R.id.yr2001);
        mandela = (RadioButton)findViewById(R.id.mandela);
        fnb = (RadioButton)findViewById(R.id.fnb);

        //this is for the view of Text View
        score = (TextView)findViewById(R.id.score);
        showScore = (Button)findViewById(R.id.showScore);

        //set the button click
        showScore.setOnClickListener(this);

    }

    //this method will take you back to the main page
    public void backToMain(View view)
    {
        Intent back = new Intent(this,MainActivity.class);
        startActivity(back);
        finish();
    }
    //this method will clear everything an allow the user to retry the quiz
    public void clearButton(View view)
    {
        question1.clearCheck();
        question2.clearCheck();
        question33.clearCheck();
        question44.clearCheck();
        question55.clearCheck();
        score.setText("");
    }

    @Override
    public void onClick(View view) {
        int sum = 0;

        if(shaba.isChecked())
        {
            sum += 1;
        }
        if(years27.isChecked())
        {
            sum += 1;
        }
        if(yr2001.isChecked())
        {
            sum += 1;
        }
        if(mandela.isChecked())
        {
            sum += 1;
        }
        if(fnb.isChecked())
        {
            sum += 1;
        }

        String message = "";
        if(sum < 3)
        {
            message = "You had failed!";
        }
        else
        {
            message = " Congratulations you had passed";
        }

        score.setText(""+message);
    }
}
