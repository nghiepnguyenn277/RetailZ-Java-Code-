package com.example.dropdownmenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout textInputProperty;
    private TextInputLayout textInputBedrooms;
    private TextInputLayout textInputDatetime;
    private TextInputLayout textInputMonthlyrentprice;
    private TextInputLayout textInputNameofthereporter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputProperty = findViewById(R.id.Property);
        textInputBedrooms = findViewById(R.id.Bedrooms);
        textInputDatetime = findViewById(R.id.Datetime);
        textInputMonthlyrentprice = findViewById(R.id.Monthly_rent_price);
        textInputNameofthereporter = findViewById(R.id.Name_of_the_reporter);

    }
    private  boolean validateProperty(){
        String propertyInput = textInputProperty.getEditText().getText().toString().trim();
        if  (propertyInput.isEmpty()){
                textInputProperty.setError("Fied can't be empty");
                return false;
        }else {
            textInputProperty.setError(null);
            return true ;
        }
    }
    private  boolean validateBedrooms(){
        String bedroomstInput = textInputBedrooms.getEditText().getText().toString().trim();
        if  (bedroomstInput.isEmpty()){
            textInputBedrooms.setError("Fied can't be empty");
            return false;
        }else {
            textInputBedrooms.setError(null);
            return true ;
        }
    }
    private  boolean validateDatetime(){
        String datetimetInput = textInputDatetime.getEditText().getText().toString().trim();
        if  (datetimetInput.isEmpty()){
            textInputDatetime.setError("Fied can't be empty");
            return false;
        }else {
            textInputDatetime.setError(null);
            return true ;
        }
    }
    private  boolean validateMonthlyrentprice(){
        String monthlyrentpriceInput = textInputMonthlyrentprice.getEditText().getText().toString().trim();
        if  (monthlyrentpriceInput.isEmpty()){
            textInputMonthlyrentprice.setError("Fied can't be empty");
            return false;
        }else {
            textInputMonthlyrentprice.setError(null);
            return true ;
        }
    }
    private  boolean validateNameofthereporter(){
        String nameofthereporterInput = textInputNameofthereporter.getEditText().getText().toString().trim();
        if  (nameofthereporterInput.isEmpty()){
            textInputNameofthereporter.setError("Fied can't be empty");
            return false;
        }else {
            textInputNameofthereporter.setError(null);
            return true ;
        }
    }



    public  void  Addbt(View v) {
        if (!validateProperty() | !validateBedrooms() | !validateDatetime() | !validateMonthlyrentprice() | !validateNameofthereporter()){
            return;
        }

        Toast.makeText(MainActivity.this,"Add Successfully!",Toast.LENGTH_LONG).show();

    }
}