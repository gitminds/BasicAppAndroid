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

public class TextAlphabets extends AppCompatActivity {

    private TextView textView_alpha;
    private TextView textView_beta;
    private ImageButton homeImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        textView_alpha = (TextView) findViewById(R.id.textletter);
        textView_beta = (TextView) findViewById(R.id.textletterdtl);
        homeImageButton = (ImageButton) findViewById(R.id.imageButtonhome);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomvalue();
                applyanimation();
            }
        };
        textView_alpha.setOnClickListener(listener);
        textView_beta.setOnClickListener(listener);

        View.OnClickListener gohomelistener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TextAlphabets.this, LaunchPage.class);
                startActivity(intent);
            }
        };
        homeImageButton.setOnClickListener(gohomelistener);
    }


    public void randomvalue() {
        inputRandomizer();
        textView_alpha.setText(inputArray[0].getGifImages());
        textView_beta.setText(inputArray[0].getGifText());
    }

    TextInput a1 = new TextInput("A", "APPLE");
    TextInput a2 = new TextInput("B","BALL");
    TextInput a3 = new TextInput("C", "CAT");
    TextInput a4 = new TextInput("D", "DOG");
    TextInput a5 = new TextInput("E", "ELEPHANT");
    TextInput a6 = new TextInput("F", "FAN");
    TextInput a7 = new TextInput("G", "GIRL");
    TextInput a8 = new TextInput("H", "HORSE");
    TextInput a9 = new TextInput("I", "ICE-CREAM");
    TextInput a10 = new TextInput("J", "JAM");
    TextInput a11 = new TextInput("K", "KITE");
    TextInput a12 = new TextInput("L", "LION");
    TextInput a13 = new TextInput("M", "MONKEY");
    TextInput a14 = new TextInput("N", "NEST");
    TextInput a15 = new TextInput("O", "ORANGE");
    TextInput a16 = new TextInput("P", "PEN");
    TextInput a17 = new TextInput("Q", "QUEEN");
    TextInput a18 = new TextInput("R", "RABBIT");
    TextInput a19 = new TextInput("S", "SHIP");
    TextInput a20 = new TextInput("T", "TIGER");
    TextInput a21 = new TextInput("U", "UMBRELLA");
    TextInput a22 = new TextInput("V", "VAN");
    TextInput a23 = new TextInput("W", "WATCH");
    TextInput a24 = new TextInput("X", "X-RAY");
    TextInput a25 = new TextInput("Y", "YAK");
    TextInput a26 = new TextInput("Z", "ZEBRA");

    TextInput[] inputArray = new TextInput[]{
            a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26
    };

    private void display_textWithAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_textview);
        textView_alpha.startAnimation(animation);
    }

    private void inputRandomizer() {
        Collections.shuffle(Arrays.asList(inputArray));
    }
    public void applyanimation(){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        Animation fadeanimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        textView_alpha.startAnimation(animation);
        textView_beta.startAnimation(fadeanimation);
    }

}
