package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        new TestingMain().checkAddition();
        new TestingMain().checkSubtraction();
        new TestingMain().checkUsername();
    }

    private void checkAddition() {
        Calculator addAToB = new Calculator();
        int additionResult = addAToB.add(2, 2);

        if (additionResult == 4) {
            System.out.println("Add method passed the test!");
        } else {
            System.out.println("Add method didn't pass the test.");
        }
    }
    private static void checkSubtraction() {
        Calculator subtractAfromB = new Calculator();
        int subtractionResult = subtractAfromB.subtract(2, 2);

        if (subtractionResult == 0) {
            System.out.println("Subtract method passed the test!");
        } else {
            System.out.println("Subtract method didn't pass the test.");
        }
    }
    private static void checkUsername() {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Username test passed!");
        } else {
            System.out.println("Username test failed!");
        }
    }
}