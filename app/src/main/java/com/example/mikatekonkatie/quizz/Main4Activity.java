package com.example.mikatekonkatie.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
  TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv=(TextView)findViewById(R.id.textView7);

        Intent intent=getIntent();
        String answr=intent.getStringExtra(Main3Activity.ANSWER);
        String out=intent.getStringExtra(Main3Activity.OUTCOME);




        tv.setText("You have scored   "  +  answr+ "  so you " +out);

    }



}
