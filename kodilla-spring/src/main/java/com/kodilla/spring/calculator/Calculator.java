package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

   public double add(final double a, final double b) {
       double result = a + b;
       display.displayValue(result);
       return result;
   }

   public double sub(final double a, final double b) {
       double result = a - b;
       display.displayValue(result);
       return result;
   }

   public double mul(final double a, final double b) {
       double result = a * b;
       display.displayValue(result);
       return result;
   }

   public double div(final double a, final double b) throws IllegalArgumentException {
       if (b == 0) {
           throw new IllegalArgumentException("Don't divide by ZERO!");
       }
       double result = a / b;
       display.displayValue(result);
       return result;
    }
}
