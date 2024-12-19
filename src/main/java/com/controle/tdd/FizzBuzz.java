package com.controle.tdd;

public class FizzBuzz {
    public static String de(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
