package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = ((TextView)findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
//           change text color
            public void onClick(View view) {
                textview.setTextColor(getResources().getColor(R.color.white));
            }
        });
//        change background color

        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

//        change text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("Android is awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//reset all the text, text-color,background color
                textview.setText("Hello from Lily!");
                textview.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightblue));
            }
        });

//edit custom text with the text from the text field
        findViewById(R.id.editCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
//                if the text field is empty, update label with default text string
                if (userEnteredText.isEmpty()) {
                    textview.setText("Enter your own text!");
                } else
                    textview.setText(userEnteredText);
                }
        });
    }
}