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

public class AlphabetsActivity extends AppCompatActivity {

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
                clockwise();
            }
        };
        textView_details.setOnClickListener(listener);

        View.OnClickListener gohomelistener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetsActivity.this, LaunchPage.class);
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

    Input a1 = new Input(R.drawable.apple, "APPLE");
    Input a2 = new Input(R.drawable.ball,"BALL");
    Input a3 = new Input(R.drawable.cat, "CAT");
    Input a4 = new Input(R.drawable.dog, "DOG");
    Input a5 = new Input(R.drawable.elephant, "ELEPHANT");
    Input a6 = new Input(R.drawable.fan, "FAN");
    Input a7 = new Input(R.drawable.girl, "GIRL");
    Input a8 = new Input(R.drawable.horse, "HORSE");
    Input a9 = new Input(R.drawable.icecream, "ICE-CREAM");
    Input a10 = new Input(R.drawable.jam, "JAM");
    Input a11 = new Input(R.drawable.kite, "KITE");
    Input a12 = new Input(R.drawable.lion, "LION");
    Input a13 = new Input(R.drawable.monkey, "MONKEY");
    Input a14 = new Input(R.drawable.nest, "NEST");
    Input a15 = new Input(R.drawable.orange, "ORANGE");
    Input a16 = new Input(R.drawable.pen, "PEN");
    Input a17 = new Input(R.drawable.queen, "QUEEN");
    Input a18 = new Input(R.drawable.rabbit, "RABBIT");
    Input a19 = new Input(R.drawable.ship, "SHIP");
    Input a20 = new Input(R.drawable.tiger, "TIGER");
    Input a21 = new Input(R.drawable.umbrella, "UMBRELLA");
    Input a22 = new Input(R.drawable.van, "VAN");
    Input a23 = new Input(R.drawable.watch, "WATCH");
    Input a24 = new Input(R.drawable.xray, "X-RAY");
    Input a25 = new Input(R.drawable.yak, "YAK");
    Input a26 = new Input(R.drawable.zebra, "ZEBRA");
  //  Input a27 = new Input(R.drawable.img40);

    Input[] inputArray = new Input[]{
            a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26
    };

    private void display_textWithAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_textview);
        gifImage_details.startAnimation(animation);
    }

    private void inputRandomizer() {
        Collections.shuffle(Arrays.asList(inputArray));
    }
    public void clockwise(){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        gifImage_details.startAnimation(animation);
        textView_details.startAnimation(animation);
    }

}