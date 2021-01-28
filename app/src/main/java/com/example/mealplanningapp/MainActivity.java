package com.example.mealplanningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnCreateAcc;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {R.drawable.carribean_chicken_rice, R.drawable.coconutty_rice_and_peas,
                R.drawable.healthier_easy_baked_tilapia,R.drawable.mushroom_ragu_and_polenta_egg_bake,
                R.drawable.pot_roast_with_asian_black_bean_sauce,R.drawable.saucy_beef_with_broccoli,
                R.drawable.sesame_chicken_stir_fry,R.drawable.sheet_pan_chickpea_chicken,
                R.drawable.shredded_potato_salmon_cakes,R.drawable.simple_grilled_steak_fajitas,
                R.drawable.sweet_hot_glazed_salmon,R.drawable.texmex_bean_burgers};

        viewFlipper = findViewById(R.id.sldshwMain);

        for (int image:images){
            flipperImages(image);
        }

        btnCreateAcc = (Button) findViewById(R.id.NewAccButton);
        btnCreateAcc .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateUserActivity();
            }
        });

        btnLogin = (Button) findViewById(R.id.LoginButton);
        btnLogin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuActivity();
            }
        });


    }
    private void openCreateUserActivity(){
        Intent intent = new Intent(MainActivity.this, AppTutorialActivity.class);
        startActivity(intent);
    }

    private void openMenuActivity(){
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void flipperImages(int image){
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundResource(image);

        viewFlipper.addView(imageview);
        viewFlipper.setFlipInterval(4000);  //4 sec
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

}

