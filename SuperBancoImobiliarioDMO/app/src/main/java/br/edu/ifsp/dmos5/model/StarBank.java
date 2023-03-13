package br.edu.ifsp.dmos5.model;

public class StarBank {

    private static StarBank instance = null;
    private CreditCard cards;
    private StarBank(){}

    public static StarBank getInstance(StarBank starBank){
        if(instance == null){
            instance = new StarBank();
        }
        return instance;
    }

    public void startCreditCard(){
        this.cards = new CreditCard();
    }

    public void roundCompleted(CreditCard card, double value){
        cards.creditValue(value);
    }

    public boolean trasfer(CreditCard payer, CreditCard receiver, double value){
        if(value > 0){
            payer.creditValue(value);
            receiver.debitValue(value);
            return true;
        }
        return false;
    }

    public void receive(CreditCard card, double value){
        card.creditValue(value);
    }

    public boolean pay(CreditCard card, double value){
        card.debitValue(value);
        return false;
    }

}
