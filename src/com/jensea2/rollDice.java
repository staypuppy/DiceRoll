package com.jensea2;

import java.util.Random;
import java.util.Scanner;

public class rollDice {

    public static void rollBoth() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many roles do you want to take: ");
        int rolls = userInput.nextInt();

        Random dice = new Random();

        for (int rollNumber = 1; rollNumber <= rolls; rollNumber++) {

            int rollDice1 = dice.nextInt(6) + 1;
            int rollDice2 = dice.nextInt(6) + 1;

            System.out.println("Roll " + rollNumber + ":");
            System.out.println("Dice One: " + rollDice1);
            System.out.println("Dice Two: " + rollDice2);
            int sum = rollDice1 + rollDice2;
            System.out.println("Sum: " + sum);
            System.out.println();
        }
    }
}
