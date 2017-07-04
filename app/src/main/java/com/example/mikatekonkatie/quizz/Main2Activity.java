package com.example.mikatekonkatie.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private RadioGroup grp;
    private RadioButton rad;
    private RadioGroup grp1;
    private RadioButton rad1;
    private RadioGroup grp2;
    private RadioButton rad2;
    private RadioGroup grp3;
    private RadioButton rad3;



    public static String OUTCOMES;
    public static int ANSWERS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    grp = (RadioGroup) findViewById(R.id.grpSop);
    grp1 = (RadioGroup) findViewById(R.id.grpRometic);
    grp2 = (RadioGroup) findViewById(R.id.grpman);
    grp3 = (RadioGroup) findViewById(R.id.grpwoman);

}

    public void view(View view) {

        int selected = grp.getCheckedRadioButtonId();
        rad = (RadioButton) findViewById(selected);

        int score = 0;

        if (rad.getId() == R.id.radscand) {


            score = 0;

        } else if (rad.getId() == R.id.radgener) {

            score = 0;


        } else if (rad.getId() == R.id.radskeem) {

            score = 1;
        } else if (rad.getId() == R.id.raduzal) {

            score = 0;
        }
        int selected1 = grp1.getCheckedRadioButtonId();
        rad1 = (RadioButton) findViewById(selected1);
        int score1 = 0;

        if (rad1.getId() == R.id.radhave) {


            score1 = 0;

        } else if (rad1.getId() == R.id.radempire) {

            score1 = 0;


        } else if (rad1.getId() == R.id.radloving) {

            score1 = 1;
        } else if (rad1.getId() == R.id.radmary) {

            score1 = 0;

        }
        int selected2 = grp2.getCheckedRadioButtonId();
        rad2 = (RadioButton) findViewById(selected2);
        int score2 = 0;

        if (rad2.getId() == R.id.radmenzi) {


            score2 = 0;

        } else if (rad2.getId() == R.id.radsilo) {

            score2 = 0;


        } else if (rad2.getId() == R.id.radkk) {

            score2 = 1;
        } else if (rad2.getId() == R.id.radshaun) {

            score2 = 0;
        }
        int selected3 = grp3.getCheckedRadioButtonId();
        rad3 = (RadioButton) findViewById(selected3);

        int score3 = 0;

        if (rad3.getId() == R.id.radlelet) {


            score3 = 1;

        } else if (rad3.getId() == R.id.radkat) {

            score3 = 0;


        } else if (rad3.getId() == R.id.radconny) {

            score3 = 0;
        } else if (rad3.getId() == R.id.radsindi) {

            score3 = 0;


        }
       // int total = 0;
        ANSWERS = score + score1 + score2 + score3;

       // String outcome = "  ";

        if (ANSWERS <= 2) {
            OUTCOMES = "FAIL";

        } else {
            OUTCOMES = "PASS";
        }

         Intent intent = new Intent(Main2Activity.this, Main5Activity.class);

        startActivity(intent);



       //  Toast.makeText(Main2Activity.this, "You have scored " +ANSWERS+"  "+"out of 4"+"  "+ OUTCOMES, Toast.LENGTH_SHORT).show();
    }
    public void back(View view) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }
}


