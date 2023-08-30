package com.maicuongtho.linear_layout_with_slide_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //declare objects of all linear layouts
    private LinearLayout lcontact, lvideo, laudio, lphoto, lnotes, lsettings, lmore, lquick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //hide the status bar
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        //initialise all objects declared
        lcontact = (LinearLayout)findViewById(R.id.l1);
        lvideo = (LinearLayout)findViewById(R.id.l2);
        laudio = (LinearLayout)findViewById(R.id.l3);
        lphoto = (LinearLayout)findViewById(R.id.l4);
        lnotes = (LinearLayout)findViewById(R.id.l5);
        lsettings = (LinearLayout)findViewById(R.id.l6);
        lmore = (LinearLayout)findViewById(R.id.l7);
        lquick = (LinearLayout)findViewById(R.id.l8);

        //define all the animations
        Animation lefttori = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
        Animation rightoleft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_left);
        Animation pushdwnin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down_in);
        Animation pushupin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_up_in);

        //set animation for each layout object
        lcontact.startAnimation(pushdwnin);
        lvideo.startAnimation(pushdwnin);
        laudio.startAnimation(lefttori);
        lphoto.startAnimation(rightoleft);
        lnotes.startAnimation(lefttori);
        lsettings.startAnimation(rightoleft);
        lmore.startAnimation(pushupin);
        lquick.startAnimation(pushupin);
    }
}