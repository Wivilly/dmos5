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
    private Button buttonCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText_value);

        textView = findViewById(R.id.textView_Celsius);

        buttonCelsius = findViewById(R.id.buttonCelsius);
        buttonCelsius.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        getCelsiusConvertion();
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

    @SuppressLint("DefaultLocale")
    private void getCelsiusConvertion(){
        double value = getValue();

        value = (value - 32) * (0.5555555556);

        textView.setText(String.format("%.2f Cº", value));
    }

}