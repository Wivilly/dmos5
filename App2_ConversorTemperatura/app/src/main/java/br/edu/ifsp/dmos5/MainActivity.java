package br.edu.ifsp.dmos5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView textView;

    private Button converterCToF;
    private Button converterCToK;
    private Button converterFToC;
    private Button converterFToK;
    private Button converterKToC;
    private Button converterKToF;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText_value);

        textView = findViewById(R.id.textView_value);

        converterCToF = findViewById(R.id.buttonConverterCelsiusToFahreheit);
        converterCToF.setOnClickListener(this);

        converterCToK = findViewById(R.id.buttonConverterCelsiusToKelvin);
        converterCToK.setOnClickListener(this);

        converterFToC = findViewById(R.id.buttonConverterFahreheitToCelsius);
        converterFToC.setOnClickListener(this);

        converterFToK = findViewById(R.id.buttonConverterFahreheitToKelvin);
        converterFToK.setOnClickListener(this);

        converterKToC = findViewById(R.id.buttonConverterKelvinToCelsius);
        converterKToC.setOnClickListener(this);

        converterKToF = findViewById(R.id.buttonConverterKelvinToFahrenheit);
        converterKToF.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == converterCToF){
            getCelsiusToFahreheit();
        }
        if(view == converterCToK){
            getCelsiusToKelvin();
        }
        if(view == converterFToC){
            getFahreiheitToCelsius();
        }
        if(view == converterFToK){
            getFahreiheitToKelvin();
        }
        if(view == converterKToC){
            getKelvinToCelsius();
        }
        if(view == converterKToF){
            getKelvinToFahreiheit();
        }
    }

    private double getValue(){
        double value;
        String valueString;

        valueString = editText.getText().toString();

        try {
            value = Double.parseDouble(valueString);
        }catch (NumberFormatException e){
            Toast.makeText(this, "Valor invalido.", Toast.LENGTH_SHORT).show();
            value = 0;
        }
        return value;
    }

    private void getCelsiusToFahreheit(){
        double value = getValue();

        value = (value * 1.8) + 32;

        textView.setText(String.format("%.2f ºF", value));
    }

    private void getCelsiusToKelvin(){
        double value = getValue();

        value = value + 273.15;

        textView.setText(String.format("%.2f K", value));
    }

    @SuppressLint("DefaultLocale")
    private void getFahreiheitToCelsius(){
        double value = getValue();

        value = (value  * 1.8) + 32;

        textView.setText(String.format("%.2f ºC", value));
    }

    private void getFahreiheitToKelvin(){
        double value = getValue();

        value = ((value - 32) * 1.8) + 273.15;

        textView.setText(String.format("%.2f K", value));
    }

    private void getKelvinToCelsius(){
        double value = getValue();

        value = value - 273.15;

        textView.setText(String.format("%.2f ºC", value));
    }

    private void getKelvinToFahreiheit(){
        double value = getValue();

        value = ((value - 273.15)* 1.8) + 32;

        textView.setText(String.format("%.2f ºF", value));
    }
}