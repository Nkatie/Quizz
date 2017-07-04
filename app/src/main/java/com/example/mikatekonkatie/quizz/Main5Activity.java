package com.example.mikatekonkatie.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

       TextView tv2=(TextView)findViewById(R.id.textView13);
        tv2.setText("You have scored "+Main2Activity.ANSWERS+"  "+Main2Activity.OUTCOMES);
    }
}
