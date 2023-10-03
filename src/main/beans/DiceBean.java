package main.beans;

import java.util.Random;

public class DiceBean {

    // DECLARATION

    private int value;

    // MÉTHODES

    public void roll() {
        value = new Random().nextInt(6)+1;
    }


    // ACCESSEURS

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
