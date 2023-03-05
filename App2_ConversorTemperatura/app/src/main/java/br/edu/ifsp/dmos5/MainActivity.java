package br.edu.ifsp.dmos5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText_value;
    private TextView textView;
    private Button buttonCelsius;
    private Button buttonFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_value = findViewById(R.id.editText_value);

        textView = findViewById(R.id.textView_result);

        buttonCelsius = findViewById(R.id.buttonConverterCelsius);
        buttonCelsius.setOnClickListener(this);

        buttonFahrenheit = findViewById(R.id.buttonConverterFahrenheit);
        buttonFahrenheit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == buttonCelsius){
            getCelsiusConvertion();
        }
        if(view == buttonFahrenheit){
            getFahrenheitConvertion();
        }
    }

    private double getValue(){
        double value;
        String valueString;

        valueString = editText_value.getText().toString();

        try {
            value = Double.parseDouble(valueString);
        }catch (NumberFormatException e){
            Toast.makeText(this,"Valor invalido.",Toast.LENGTH_SHORT).show();
            value = 0;
        }
        return value;
    }

    private void getCelsiusConvertion(){
        double value = getValue();

        value = (value - 32) / 1.8;

        textView.setText(String.format("%.2f ºC", value));
    }

    private void getFahrenheitConvertion(){
        double value = getValue();

        value = (value * 1.8) + 32;

        textView.setText(String.format("%.2f ºF",value));
    }
}