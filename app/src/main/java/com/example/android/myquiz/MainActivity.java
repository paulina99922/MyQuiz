package com.example.android.myquiz;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    int score;
    RadioButton answer1aRadioButton;
    RadioButton answer1bRadioButton;
    RadioButton answer1cRadioButton;
    RadioButton answer2aRadioButton;
    RadioButton answer2bRadioButton;
    RadioButton answer2cRadioButton;
    RadioButton answer2dRadioButton;
    RadioButton answer3aRadioButton;
    RadioButton answer3bRadioButton;
    RadioButton answer3cRadioButton;
    RadioButton answer3dRadioButton;
    RadioButton answer4aRadioButton;
    RadioButton answer4bRadioButton;
    RadioButton answer4cRadioButton;
    RadioButton answer4dRadioButton;
    RadioButton answer5aRadioButton;
    RadioButton answer5bRadioButton;
    RadioButton answer5cRadioButton;
    RadioButton answer6aRadioButton;
    RadioButton answer6bRadioButton;
    RadioButton answer7aRadioButton;
    RadioButton answer7bRadioButton;
    RadioButton answer8aRadioButton;
    RadioButton answer8bRadioButton;
    RadioButton answer8cRadioButton;
    RadioButton answer8dRadioButton;
    CheckBox answer9aCheckBox;
    CheckBox answer9bCheckBox;
    CheckBox answer9cCheckBox;
    CheckBox answer9dCheckBox;
    CheckBox answer9eCheckBox;
    EditText answer10EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1aRadioButton = (RadioButton) findViewById(R.id.answer1a);
        answer1bRadioButton = (RadioButton) findViewById(R.id.answer1b);
        answer1cRadioButton = (RadioButton) findViewById(R.id.answer1c);
        answer2aRadioButton = (RadioButton) findViewById(R.id.answer2a);
        answer2bRadioButton = (RadioButton) findViewById(R.id.answer2b);
        answer2cRadioButton = (RadioButton) findViewById(R.id.answer2c);
        answer2dRadioButton = (RadioButton) findViewById(R.id.answer2d);
        answer3aRadioButton = (RadioButton) findViewById(R.id.answer3a);
        answer3bRadioButton = (RadioButton) findViewById(R.id.answer3b);
        answer3cRadioButton = (RadioButton) findViewById(R.id.answer3c);
        answer3dRadioButton = (RadioButton) findViewById(R.id.answer3d);
        answer4aRadioButton = (RadioButton) findViewById(R.id.answer4a);
        answer4bRadioButton = (RadioButton) findViewById(R.id.answer4b);
        answer4cRadioButton = (RadioButton) findViewById(R.id.answer4c);
        answer4dRadioButton = (RadioButton) findViewById(R.id.answer4d);
        answer5aRadioButton = (RadioButton) findViewById(R.id.answer5a);
        answer5bRadioButton = (RadioButton) findViewById(R.id.answer5b);
        answer5cRadioButton = (RadioButton) findViewById(R.id.answer5c);
        answer6aRadioButton = (RadioButton) findViewById(R.id.answer6a);
        answer6bRadioButton = (RadioButton) findViewById(R.id.answer6b);
        answer7aRadioButton = (RadioButton) findViewById(R.id.answer7a);
        answer7bRadioButton = (RadioButton) findViewById(R.id.answer7b);
        answer8aRadioButton = (RadioButton) findViewById(R.id.answer8a);
        answer8bRadioButton = (RadioButton) findViewById(R.id.answer8b);
        answer8cRadioButton = (RadioButton) findViewById(R.id.answer8c);
        answer8dRadioButton = (RadioButton) findViewById(R.id.answer8d);
        answer9aCheckBox = (CheckBox) findViewById(R.id.answer9a);
        answer9bCheckBox = (CheckBox) findViewById(R.id.answer9b);
        answer9cCheckBox = (CheckBox) findViewById(R.id.answer9c);
        answer9dCheckBox= (CheckBox) findViewById(R.id.answer9d);
        answer9eCheckBox = (CheckBox) findViewById(R.id.answer9e);
        answer10EditText= (EditText) findViewById(R.id.answer10);}

    public void submit(View v) {
        boolean answer1aRadioButtonIsChecked = answer1aRadioButton.isChecked();
        boolean answer1bRadioButtonIsChecked = answer1bRadioButton.isChecked();
        boolean answer1cRadioButtonIsChecked = answer1cRadioButton.isChecked();
        if (answer1cRadioButtonIsChecked) {
            score += 1;
        } else if (answer1aRadioButtonIsChecked) {
            score += 0;
        } else if (answer1bRadioButtonIsChecked) {
            score += 0;
        }
        boolean answer2aRadioButtonIsChecked = answer2aRadioButton.isChecked();
        boolean answer2bRadioButtonIsChecked = answer2bRadioButton.isChecked();
        boolean answer2cRadioButtonIsChecked = answer2cRadioButton.isChecked();
        boolean answer2dRadioButtonIsChecked = answer2dRadioButton.isChecked();
        if (answer2bRadioButtonIsChecked) {
            score += 1;
        } else if (answer2aRadioButtonIsChecked) {
            score += 0;
        } else if (answer2cRadioButtonIsChecked) {
            score += 0;
        } else if (answer2dRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer3aRadioButtonIsChecked = answer3aRadioButton.isChecked();
        boolean answer3bRadioButtonIsChecked = answer3bRadioButton.isChecked();
        boolean answer3cRadioButtonIsChecked = answer3cRadioButton.isChecked();
        boolean answer3dRadioButtonIsChecked = answer3dRadioButton.isChecked();
        if (answer3aRadioButtonIsChecked) {
            score += 1;
        } else if (answer3bRadioButtonIsChecked) {
            score += 0;
        } else if (answer3cRadioButtonIsChecked) {
            score += 0;
        } else if (answer3dRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer4aRadioButtonIsChecked = answer4aRadioButton.isChecked();
        boolean answer4bRadioButtonIsChecked = answer4bRadioButton.isChecked();
        boolean answer4cRadioButtonIsChecked = answer4cRadioButton.isChecked();
        boolean answer4dRadioButtonIsChecked = answer4dRadioButton.isChecked();
        if (answer4cRadioButtonIsChecked) {
            score += 1;
        } else if (answer4aRadioButtonIsChecked) {
            score += 0;
        } else if (answer4bRadioButtonIsChecked) {
            score += 0;
        } else if (answer4dRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer5aRadioButtonIsChecked = answer5aRadioButton.isChecked();
        boolean answer5bRadioButtonIsChecked = answer5bRadioButton.isChecked();
        boolean answer5cRadioButtonIsChecked = answer5cRadioButton.isChecked();
        if (answer5aRadioButtonIsChecked) {
            score += 1;
        } else if (answer5bRadioButtonIsChecked) {
            score += 0;
        } else if (answer5cRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer6aRadioButtonIsChecked = answer6aRadioButton.isChecked();
        boolean answer6bRadioButtonIsChecked = answer6bRadioButton.isChecked();
        if (answer6aRadioButtonIsChecked) {
            score += 1;
        } else if (answer6bRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer7aRadioButtonIsChecked = answer7aRadioButton.isChecked();
        boolean answer7bRadioButtonIsChecked = answer7bRadioButton.isChecked();
        if (answer7aRadioButtonIsChecked) {
            score += 1;
        } else if (answer7bRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer8aRadioButtonIsChecked = answer8aRadioButton.isChecked();
        boolean answer8bRadioButtonIsChecked = answer8bRadioButton.isChecked();
        boolean answer8cRadioButtonIsChecked = answer8cRadioButton.isChecked();
        boolean answer8dRadioButtonIsChecked = answer8dRadioButton.isChecked();
        if (answer8bRadioButtonIsChecked) {
            score += 1;
        } else if (answer8aRadioButtonIsChecked) {
            score += 0;
        } else if (answer8cRadioButtonIsChecked) {
            score += 0;
        } else if (answer8dRadioButtonIsChecked) {
            score += 0;
        }

        boolean answer9aCheckBoxIsChecked = answer9aCheckBox.isChecked();
        boolean answer9bCheckBoxIsChecked = answer9bCheckBox.isChecked();
        boolean answer9cCheckBoxIsChecked = answer9cCheckBox.isChecked();
        boolean answer9dCheckBoxIsChecked = answer9dCheckBox.isChecked();
        boolean answer9eCheckBoxIsChecked = answer9eCheckBox.isChecked();
        if (answer9cCheckBoxIsChecked && answer9eCheckBoxIsChecked && !!answer9aCheckBoxIsChecked
                && !!answer9bCheckBoxIsChecked && !!answer9dCheckBoxIsChecked) {
            score += 1;}
        else if (answer9aCheckBoxIsChecked)
        {score += 0;}
        else if (answer9bCheckBoxIsChecked)
        {score +=0;}
        else if (answer9dCheckBoxIsChecked)
        {score +=0;}

        EditText answer10 = (EditText) findViewById(R.id.answer10);
        if (answer10.getText().toString().equals("true")) {
            score += 1;}
        else {score += 0;}

        if (score == 0) {
            Toast.makeText(this, "You did not get any answers right! Try again!", Toast.LENGTH_LONG).show();
        } else if (score == 1) {
            Toast.makeText(this, "You scored only 1 out of 10! Try again!", Toast.LENGTH_LONG).show();
        } else if (score == 2) {
            Toast.makeText(this, "You scored only 2 out of 10! Try again!", Toast.LENGTH_LONG).show();
        } else if (score == 3) {
            Toast.makeText(this, "You scored only 3 out of 10! Try again!", Toast.LENGTH_LONG).show();
        } else if (score == 4) {
            Toast.makeText(this, "4 out of 10! Not bad!", Toast.LENGTH_LONG).show();
        } else if (score == 5) {
            Toast.makeText(this, "5 out of 10! Not bad!", Toast.LENGTH_LONG).show();
        } else if (score == 6) {
            Toast.makeText(this, "6 out of 10! Nice job!", Toast.LENGTH_LONG).show();
        } else if (score == 7) {
            Toast.makeText(this, "7 out of 10! Nice job!", Toast.LENGTH_LONG).show();
        } else if (score == 8) {
            Toast.makeText(this, "8 out of 10! You did a great job!", Toast.LENGTH_LONG).show();
        } else if (score == 9) {
            Toast.makeText(this, "9 out of 10! Amazing!", Toast.LENGTH_LONG).show();
        } else if (score == 10) {
            Toast.makeText(this, "10 out of 10!! Perfect!!", Toast.LENGTH_LONG).show();
        }
        score =0;
    }
}