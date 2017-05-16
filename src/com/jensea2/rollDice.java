package com.jensea2;

import java.util.Random;
import java.util.Scanner;

class rollDice /*extends CompareDice*/ {

    public static void rollBoth() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many rolls do you want to take: ");
        while (!userInput.hasNextInt()) {
            System.out.println("Please enter a positive number!");
            userInput.next();
        }
        int rolls = userInput.nextInt();

        Random dice = new Random();

        for (int rollNumber = 1; rollNumber <= rolls; rollNumber++) {

            int rollDice1 = dice.nextInt(6) + 1;
            int rollDice2 = dice.nextInt(6) + 1;
            int rollDice3 = dice.nextInt(6) + 1;
            int rollDice4 = dice.nextInt(6) + 1;

            System.out.println();
            System.out.println("Pair 1 / " + "Roll " + rollNumber + ":");
            System.out.println("Dice One: " + rollDice1);
            System.out.println("Dice Two: " + rollDice2);
            int sum1 = rollDice1 + rollDice2;
            System.out.println("Sum: " + sum1);
            System.out.println();

            System.out.println("Pair 2 / " + "Roll " + rollNumber + ":");
            System.out.println("Dice One: " + rollDice3);
            System.out.println("Dice Two: " + rollDice4);
            int sum2 = rollDice3 + rollDice4;
            System.out.println("Sum: " + sum2);
            System.out.println();
            if (sum1 > sum2) {
                System.out.println("Pair 1 wins!");
            } else if  (sum1 < sum2) {
                System.out.println("Pair 2 wins!");
            }   else if (sum1 == sum2) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Results could not be determined");
            }
            System.out.println();
            System.out.println("=================");
        }
    }
}

