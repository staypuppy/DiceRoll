package com.jensea2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        rollDice();
        diceValue();

    }

    public static void rollDice() {
        for (int rollNumber = 1; rollNumber < 11; rollNumber++) {
            System.out.println(rollNumber);
            }


    }

    public static int diceValue() {
        Random rand = new Random();
        for (int diceValue=0;diceValue < 10;diceValue++)
        {
            System.out.println((rand.nextInt(6-1+1)+1));
        }
        return 0;



    }
}
