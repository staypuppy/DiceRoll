package com.jensea2;

import java.util.Random;

public class rollDiceAgain {

    //roll 2 dice and display their random values
    public static void rollBoth() {

        Random dice1 = new Random();
        Random dice2 = new Random();

        for (int rollNumber = 1; rollNumber < 11; rollNumber++) {

            int rollDice1 = dice1.nextInt(6) + 1;
            int rollDice2 = dice2.nextInt(6) + 1;
            System.out.println("Roll " + rollNumber + ":");
            System.out.println("Dice One: " + rollDice1);
            System.out.println("Dice Two: " + rollDice2);
            int sum = rollDice1 + rollDice2;
            System.out.println("Sum: " + sum);
            System.out.println();
        }
          }
}
