package com.example.mealplanningapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BodyMassActivity extends AppCompatActivity {
    EditText weight, height;
    TextView result;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_mass);

        weight = findViewById(R.id.bmi_weight);
        height = findViewById(R.id.bmi_height);
        result = findViewById(R.id.bmi_result);

    }

    public void calculateBMi(View view) {
        String W = weight.getText().toString();
        String H = height.getText().toString();

        float weightValue = Float.parseFloat(W);
        float heightValue = Float.parseFloat(H) / 100;

        float bmi = weightValue / (heightValue * heightValue);

        if (bmi < 16){
            BMIresult = "Severely Under Weight";}
        else if (bmi < 18.5){
            BMIresult = "Under Weight";}
        else if (bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Stable Weight";}
        else if (bmi >= 25 && bmi <= 29.9){
            BMIresult = "Overweight";}
        else
            {
            BMIresult = "Obese";
            }

        calculation = "Result\n" + bmi + "\n" + BMIresult;
        result.setText(calculation);
    }

}
