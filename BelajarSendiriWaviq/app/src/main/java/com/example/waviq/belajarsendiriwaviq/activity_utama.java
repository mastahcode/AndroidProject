package com.example.waviq.belajarsendiriwaviq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_utama extends AppCompatActivity {

    public void submit(View v){

        EditText input = (EditText)findViewById(R.id.input);
        TextView a = (TextView)findViewById(R.id.waviq);
        a.setText(input.getText().toString());
        input.getText().clear();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loyout_utama);
    }
}
