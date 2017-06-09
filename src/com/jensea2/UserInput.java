package com.jensea2;

import java.util.Scanner;

/**
 * Created by jensea2 on 6/9/2017.
 */
public class UserInput {

    public int getNumUserRolls (){
        Scanner user_rolls = new Scanner(System.in);
        System.out.println("Enter the number of rolls you want to take: ");
        return user_rolls.nextInt();
    }

}
