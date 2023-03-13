package br.edu.ifsp.dmos5.model;


import android.content.res.Configuration;
import android.widget.Toast;

import javax.xml.datatype.DatatypeConfigurationException;

public class CreditCard {

    private static Integer[] LAST_CARD_ID;
    private Integer id;
    private double balance;

    public CreditCard(){
        this.id += 1;
        this.balance = 25000.00;
        LAST_CARD_ID[1] = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void creditValue(double value){
        this.balance += value;
    }

    public void debitValue(double value){
        try {
            this.balance -= value;
        }catch (NumberFormatException e){
            this.balance += value;
        }
    }
}
