package com.example.mansi.puneguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView hotel;
    private ImageView restaurant;
    private ImageView todo;
    private ImageView about;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);

        LinearLayout layout = (LinearLayout) findViewById(R.id.home_layout);
        layout.setAnimation(animation);

        //display the logo during 2 seconds
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                //set the new Content of your activity
                setContentView(R.layout.activity_main);

                hotel = (ImageView) findViewById(R.id.hotel_image);
                restaurant = (ImageView) findViewById(R.id.restaurant_image);
                todo = (ImageView) findViewById(R.id.todo_image);
                about = (ImageView) findViewById(R.id.about_image);

                hotel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CategoryActivity.positon = 0;
                        Intent intent = new Intent(getBaseContext(), CategoryActivity.class);
                        startActivity(intent);
                    }
                });
                restaurant.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CategoryActivity.positon = 1;
                        Intent intent = new Intent(getBaseContext(), CategoryActivity.class);
                        startActivity(intent);
                    }
                });
                todo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CategoryActivity.positon = 2;
                        Intent intent = new Intent(getBaseContext(), CategoryActivity.class);
                        startActivity(intent);
                    }
                });
                about.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CategoryActivity.positon = 3;
                        Intent intent = new Intent(getBaseContext(), CategoryActivity.class);
                        startActivity(intent);
                    }
                });

                final TextView emergency = (TextView) findViewById(R.id.emergeny_numbers);
                emergency.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getBaseContext(), EmergencyActivity.class);
                        startActivity(intent);
                    }
                });
            }
        };
        countDownTimer.start();
    }
}
