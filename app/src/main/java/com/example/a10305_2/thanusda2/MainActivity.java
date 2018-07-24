package com.example.a10305_2.thanusda2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private RadioGroup radioGroup;

    private  String strtemper;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    strtemper = editText.getText().toString().trim();
                    if (strtemper.equals("")){
                        Log.d("Testttttt", "Have space in blank");
                    } else {
                        Log.d("Testttttt", "No spce = " +strtemper);

                        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                        startActivity(intent);
                    }

                } catch (Exception e){

                }







            }
        });

    }
}
