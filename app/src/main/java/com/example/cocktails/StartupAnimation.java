package com.example.cocktails;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.animation.ObjectAnimator;


public class StartupAnimation extends AppCompatActivity {

    private static final int ANIMATION_DURATION = 500; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView imageView = findViewById(R.id.imageView);

        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f);
        rotateAnimation.setDuration(ANIMATION_DURATION);
        //rotateAnimation.setRepeatCount(ObjectAnimator.INFINITE);

        rotateAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(StartupAnimation.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, ANIMATION_DURATION);
            }
        });

        rotateAnimation.start();
    }
}
