package br.edu.ifsp.dmos5.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;

import br.edu.ifsp.dmos5.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView textView;
    public Button buttonM;
    public Button buttonNotice;
    public Button buttonProlabore;
    public Button buttonK;
    public Button buttonReset;
    public Button buttonC;
    public Button buttonNum0;
    public Button buttonNum1;
    public Button buttonNum2;
    public Button buttonNum3;
    public Button buttonNum4;
    public Button buttonNum5;
    public Button buttonNum6;
    public Button buttonNum7;
    public Button buttonNum8;
    public Button buttonNum9;
    public Button buttonPoint;
    public Button buttonPositive;
    public Button buttonNegative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_value);

        buttonM = findViewById(R.id.buttonM);
        buttonM.setOnClickListener(this);

        buttonNotice = findViewById(R.id.buttonnotice);
        buttonNotice.setOnClickListener(this);

        buttonProlabore = findViewById(R.id.buttonprolabore);
        buttonProlabore.setOnClickListener(this);

        buttonK = findViewById(R.id.buttonK);
        buttonK.setOnClickListener(this);

        buttonReset = findViewById(R.id.buttonreset);
        buttonReset.setOnClickListener(this);

        buttonNum0 = findViewById(R.id.number0);
        buttonNum0.setOnClickListener(this);

        buttonNum1 = findViewById(R.id.number1);
        buttonNum1.setOnClickListener(this);

        buttonNum2 = findViewById(R.id.number2);
        buttonNum2.setOnClickListener(this);

        buttonNum3 = findViewById(R.id.number3);
        buttonNum3.setOnClickListener(this);

        buttonNum4 = findViewById(R.id.number4);
        buttonNum4.setOnClickListener(this);

        buttonNum5 = findViewById(R.id.number5);
        buttonNum5.setOnClickListener(this);

        buttonNum6 = findViewById(R.id.number6);
        buttonNum6.setOnClickListener(this);

        buttonNum7 = findViewById(R.id.number7);
        buttonNum7.setOnClickListener(this);

        buttonNum8 = findViewById(R.id.number8);
        buttonNum8.setOnClickListener(this);

        buttonNum9 = findViewById(R.id.number9);
        buttonNum9.setOnClickListener(this);

        buttonC = findViewById(R.id.buttonC);
        buttonC.setOnClickListener(this);

        buttonPoint = findViewById(R.id.buttonpoint);
        buttonPoint.setOnClickListener(this);

        buttonPositive = findViewById(R.id.buttonpositive);
        buttonPositive.setOnClickListener(this);

        buttonNegative = findViewById(R.id.buttonnegative);
        buttonNegative.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonM:
                System.out.println("Button");
                break;
            case R.id.buttonnotice:
                break;
            case R.id.buttonprolabore:
                break;
            case R.id.number0:
                break;
            case R.id.number1:
                break;
        }
    }

}