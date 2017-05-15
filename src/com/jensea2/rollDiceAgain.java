package com.jensea2;

import java.util.Random;

public class rollDiceAgain {

    //roll 2 dice and display their random values
    public static int rollBoth() {

        Random dice1 = new Random();
        Random dice2 = new Random();

        for (int rollNumber = 1; rollNumber < 11; rollNumber++) {
            System.out.println("Roll " + rollNumber + ":");
            System.out.println("Dice One: " + (dice1.nextInt(6) + 1));
            System.out.println("Dice Two: " + (dice2.nextInt(6) + 1));
            Random sum = dice1 + dice2;
            System.out.println();
        }
        return 0;
    }
}
