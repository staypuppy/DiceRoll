package com.jensea2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        rollDice();

    }

    public static int rollDice() {
        Random rand = new Random();
        for (int rollNumber = 1; rollNumber < 11; rollNumber++) {
            System.out.println("Roll number " + rollNumber);
            System.out.println((rand.nextInt(6) + 1));

        }
        return 0;


    }
}







