package com.training.thekidworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchPage extends AppCompatActivity {

    private Button colorButton;
    private ImageButton alphabetButton;
    private ImageButton numbersButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchpage);

        alphabetButton = (ImageButton) findViewById(R.id.buttonalphabet);
        numbersButton = (ImageButton) findViewById(R.id.buttonNumbers);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaunchPage.this, TextAlphabets.class);
                startActivity(intent);
            }
        };
        alphabetButton.setOnClickListener(listener);
        View.OnClickListener numberlistener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaunchPage.this, NumberActivity.class);
                startActivity(intent);
            }
        };
        numbersButton.setOnClickListener(numberlistener);

    }
}
