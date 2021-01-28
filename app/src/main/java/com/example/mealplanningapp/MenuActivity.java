package com.example.mealplanningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button btnFindRecipe;
    private Button btnMyFavourites;
    private Button btnGrocery;
    private Button btnBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnFindRecipe = (Button) findViewById(R.id.btn_FindARecipe);
        btnFindRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });

        btnGrocery = (Button) findViewById(R.id.btn_Grocery);
        btnGrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroceryActivity();
            }
        });

        btnBMI = (Button) findViewById(R.id.btn_bmi);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBodyMassActivity();
            }
        });

        btnMyFavourites = (Button) findViewById(R.id.btn_Favourites);
        btnMyFavourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavouritesActivity();
            }
        });

    }


    private void openSearchActivity(){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);

    }

    private void openGroceryActivity(){
        Intent intent  = new Intent(this, GroceryActivity.class);
        startActivity(intent);
    }

    private void openBodyMassActivity(){
        Intent intent = new Intent(this,BodyMassActivity.class);
        startActivity(intent);
    }

    private void openFavouritesActivity(){
        Intent intent = new Intent(this,FavouritesActivity.class);
        startActivity(intent);
    }
}
