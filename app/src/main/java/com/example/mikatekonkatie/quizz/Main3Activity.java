package com.example.mikatekonkatie.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private RadioGroup grp;
    private RadioButton rad;
    private RadioGroup grp1;
    private RadioButton rad1;
    private RadioGroup grp2;
    private RadioButton rad2;
    private RadioGroup grp3;
    private RadioButton rad3;


   public static final String ANSWER="Answer";
   public static final String OUTCOME="outcome";
   public  static int answer=0;

    public String intentAnswer;
    public String intentoutcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    grp = (RadioGroup) findViewById(R.id.grppsl);
    grp1 = (RadioGroup) findViewById(R.id.grpfor);
    grp2 = (RadioGroup) findViewById(R.id.grpAfrica);
    grp3 = (RadioGroup) findViewById(R.id.grpstad);


}

    public void display(View view) {

        int selected = grp.getCheckedRadioButtonId();
        rad = (RadioButton) findViewById(selected);

        int score = 0;

        if (rad.getId() == R.id.radErus) {


            score = 0;

        } else if (rad.getId() == R.id.radMath) {

            score = 0;


        } else if (rad.getId() == R.id.radMasan) {

            score = 0;
        } else if (rad.getId() == R.id.raddoll) {

            score = 1;
        }
        int selected1 = grp1.getCheckedRadioButtonId();
        rad1 = (RadioButton) findViewById(selected1);
        int score1 = 0;

        if (rad1.getId() == R.id.radkats) {


            score1 = 0;

        } else if (rad1.getId() == R.id.radmuso) {

            score1 = 0;


        } else if (rad1.getId() == R.id.radndor) {

            score1 = 1;
        } else if (rad1.getId() == R.id.radchira) {

            score1 = 0;

        }
        int selected2 = grp2.getCheckedRadioButtonId();
        rad2 = (RadioButton) findViewById(selected2);
        int score2 = 0;

        if (rad2.getId() == R.id.radGhana) {


            score2 = 0;

        } else if (rad2.getId() == R.id.radZam) {

            score2 = 1;


        } else if (rad2.getId() == R.id.radNig) {

            score2 = 0;
        } else if (rad2.getId() == R.id.raddrc) {

            score2 = 0;
        }
        int selected3 = grp3.getCheckedRadioButtonId();
        rad3 = (RadioButton) findViewById(selected3);

        int score3 = 0;

        if (rad3.getId() == R.id.radfnb) {


            score3 = 0;

        } else if (rad3.getId() == R.id.radgpoint) {

            score3 = 0;


        } else if (rad3.getId() == R.id.radmoses) {

            score3 = 0;
        } else if (rad3.getId() == R.id.radnmbay) {

            score3 = 1;


        }
        int total = 0;
        total = score + score1 + score2 + score3;

        String outcome = "  ";

        if (total <= 2) {
            outcome = "FAILED";

        } else {
            outcome = "PASS";
        }
        intentAnswer = String.valueOf(total);
        intentoutcome=String.valueOf(outcome);

        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
         intent.putExtra(ANSWER, intentAnswer);
         intent.putExtra(OUTCOME,intentoutcome);
        startActivity(intent);


    }
    public void back(View view){

            Intent intent = new Intent(Main3Activity.this, MainActivity.class);
            startActivity(intent);
    }
}

