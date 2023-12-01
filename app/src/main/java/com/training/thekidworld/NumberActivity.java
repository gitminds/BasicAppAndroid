package com.training.thekidworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

import pl.droidsonroids.gif.GifImageView;

public class NumberActivity extends AppCompatActivity {
    private TextView textView_details;
    private GifImageView gifImage_details;
    private ImageButton homeImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifImage_details = (GifImageView) findViewById(R.id.gifImageView);
        textView_details = (TextView) findViewById(R.id.textViewalphabets);
        homeImageButton = (ImageButton) findViewById(R.id.imageButtonhome);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomvalue();
            }
        };
        textView_details.setOnClickListener(listener);


        View.OnClickListener gohomelistener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NumberActivity.this, LaunchPage.class);
                startActivity(intent);
            }
        };
        homeImageButton.setOnClickListener(gohomelistener);
    }

    public void randomvalue() {
        inputRandomizer();
        gifImage_details.setImageResource(inputArray[0].getGifImages());
        textView_details.setText(inputArray[0].getGifText());
    }

    Input a1 = new Input(R.drawable.one, "ONE");
    Input a2 = new Input(R.drawable.two,"TWO");
    Input a3 = new Input(R.drawable.three, "THREE");
    Input a4 = new Input(R.drawable.four, "FOUR");
    Input a5 = new Input(R.drawable.five, "FIVE");
    Input a6 = new Input(R.drawable.six, "SIX");
    Input a7 = new Input(R.drawable.seven, "SEVEN");
    Input a8 = new Input(R.drawable.eight, "EIGHT");
    Input a9 = new Input(R.drawable.nine, "NINE");
    Input a10 = new Input(R.drawable.ten, "TEN");
    Input a11 = new Input(R.drawable.zero, "ZERO");

    Input[] inputArray = new Input[]{
            a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11
    };

    private void display_textWithAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_textview);
        gifImage_details.startAnimation(animation);
    }
    private void inputRandomizer() {
        Collections.shuffle(Arrays.asList(inputArray));
    }
 }
