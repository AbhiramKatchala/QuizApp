package com.quiz.quizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Srinivasan on 08-02-2018.
 */

public class QuizActivity extends AppCompatActivity {


    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);


    }

    //Java Questions
    //Question One
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1_option1:
                if (checked)
                    radioButtonDisable();
                    break;
            case R.id.q1_option2:
                if (checked)
                    radioButtonDisable();
                    break;
            case R.id.q1_option3:
                if (checked)
                    score = score + 1;
                    radioButtonDisable();
                break;
            case R.id.q1_option4:
                if (checked)
                    radioButtonDisable();
                    break;
        }
    }
    public void radioButtonDisable(){
        RadioButton optionA = (RadioButton) findViewById(R.id.q1_option1);
        RadioButton optionB = (RadioButton) findViewById(R.id.q1_option2);
        RadioButton optionC = (RadioButton) findViewById(R.id.q1_option3);
        RadioButton optionD = (RadioButton) findViewById(R.id.q1_option4);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);
    }

    //Question Two
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q2_option1:
                if (checked)
                    radioButtonDisable2();
                break;
            case R.id.q2_option2:
                if (checked)
                    radioButtonDisable2();
                break;
            case R.id.q2_option3:
                if (checked)
                    radioButtonDisable2();
                break;
            case R.id.q2_option4:
                if (checked)
                    score = score + 1;
                    radioButtonDisable2();
                break;
        }
    }
    public void radioButtonDisable2(){
        RadioButton optionA = (RadioButton) findViewById(R.id.q2_option1);
        RadioButton optionB = (RadioButton) findViewById(R.id.q2_option2);
        RadioButton optionC = (RadioButton) findViewById(R.id.q2_option3);
        RadioButton optionD = (RadioButton) findViewById(R.id.q2_option4);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);
    }

    //Question Three
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q3_option1:
                if (checked)
                    radioButtonDisable3();
                break;
            case R.id.q3_option2:
                if (checked)
                    score = score + 1;
                    radioButtonDisable3();
                break;
            case R.id.q3_option3:
                if (checked)
                    radioButtonDisable3();
                break;
            case R.id.q3_option4:
                if (checked)
                    radioButtonDisable3();
                break;
        }
    }
    public void radioButtonDisable3(){
        RadioButton optionA = (RadioButton) findViewById(R.id.q3_option1);
        RadioButton optionB = (RadioButton) findViewById(R.id.q3_option2);
        RadioButton optionC = (RadioButton) findViewById(R.id.q3_option3);
        RadioButton optionD = (RadioButton) findViewById(R.id.q3_option4);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);
    }

    //Question Four
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q4_option1:
                if (checked)
                    radioButtonDisable4();
                break;
            case R.id.q4_option2:
                if (checked)
                    radioButtonDisable4();
                break;
            case R.id.q4_option3:
                if (checked)
                    score = score + 1;
                    radioButtonDisable4();
                break;
            case R.id.q4_option4:
                if (checked)
                    radioButtonDisable4();
                break;
        }
    }
    public void radioButtonDisable4(){
        RadioButton optionA = (RadioButton) findViewById(R.id.q4_option1);
        RadioButton optionB = (RadioButton) findViewById(R.id.q4_option2);
        RadioButton optionC = (RadioButton) findViewById(R.id.q4_option3);
        RadioButton optionD = (RadioButton) findViewById(R.id.q4_option4);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);
    }

    //Question Five
    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q5_option1:
                if (checked)
                    radioButtonDisable5();
                break;
            case R.id.q5_option2:
                if (checked)
                    radioButtonDisable5();
                break;
            case R.id.q5_option3:
                if (checked)
                    score = score + 1;
                radioButtonDisable5();
                break;
            case R.id.q5_option4:
                if (checked)
                    radioButtonDisable5();
                break;
        }
    }
    public void radioButtonDisable5(){
        RadioButton optionA = (RadioButton) findViewById(R.id.q5_option1);
        RadioButton optionB = (RadioButton) findViewById(R.id.q5_option2);
        RadioButton optionC = (RadioButton) findViewById(R.id.q5_option3);
        RadioButton optionD = (RadioButton) findViewById(R.id.q5_option4);

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);
    }

    public void showResult(View view){
        Toast.makeText(QuizActivity.this, "Your total score is: " + score, Toast.LENGTH_SHORT).show();
    }


}
