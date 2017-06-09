package com.jensea2;

import java.util.Random;
import java.util.Scanner;


public class RollDiceAgain {



    //roll 2 dice and display their random values
    public void rollBoth() {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice(6);
        UserInput userInput = new UserInput();
        int count = userInput.getNumUserRolls();

        for (int rollNumber = 1; rollNumber <= count; rollNumber++ ) {

            int rollDice1 = dice1.rollDice();
            int rollDice2 = dice2.rollDice();
            System.out.println("Roll " + rollNumber + ":");
            System.out.println("Dice One: " + rollDice1);
            System.out.println("Dice Two: " + rollDice2);
            int sum = rollDice1 + rollDice2;
            System.out.println("Sum: " + sum);
            System.out.println();
        }
    }
}
