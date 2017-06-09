package com.jensea2;

import java.util.Random;

/**
 * Created by jensea2 on 6/9/2017.
 */
public class Dice {

    private int diceNumberOfSides;

    public Dice(){
        diceNumberOfSides = 12;
    }


    public Dice(int diceNumberOfSides) {
        this.diceNumberOfSides = diceNumberOfSides;

    }

    public int rollDice() {
        Random random = new Random();
        return random.nextInt(diceNumberOfSides) + 1;
    }

}
