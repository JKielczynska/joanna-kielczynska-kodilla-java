package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator addAToB = new Calculator();

        int additionResult = addAToB.add(1,1);

        if(additionResult == 2) {
            System.out.println("Testing add method was successful!");
        } else {
            System.out.println("Testing add method failed.");
        }

        Calculator substractAfromB = new Calculator();

        int substractionResult = substractAfromB.substract(1,1);

        if(substractionResult == 0) {
            System.out.println("Testing substract method was successful!");
        } else {
            System.out.println("Testing substract method failed.");
        }
    }
}
