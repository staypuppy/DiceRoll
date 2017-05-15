package com.jensea2;

import java.util.Random;



public class rollDice {
    //Roll the dice 10 times and produce random values between 1 - 6
        public static int rollDie(int diceNumber) {
            Random rand = new Random();
            for (int rollNumber = 1; rollNumber < 11; rollNumber++) {
                System.out.println("Roll Number: " + rollNumber);
                System.out.print("Dice " + diceNumber + ": ") ;
                System.out.println(rand.nextInt(6) + 1);
                System.out.println();

            }
            return 0;


        }
}
