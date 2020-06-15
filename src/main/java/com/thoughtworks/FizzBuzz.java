package com.thoughtworks;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0) {
            if (String.valueOf(number).contains("7")) {
                if (String.valueOf(number).contains("5")) {
                    stringBuilder.append("Fizz");
                }
            }
            if (!String.valueOf(number).contains("5")) {
                stringBuilder.append("Fizz");
            }
        }
        if (number % 5 == 0 && !String.valueOf(number).contains("7")) {
            stringBuilder.append("Buzz");
        }
        if (number % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        if (String.valueOf(number).contains("5")) {
            return stringBuilder.toString();
        }
        if (String.valueOf(number).contains("3")) {
            return "Fizz";
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append(String.valueOf(number));
        }
        return stringBuilder.toString();
    }

}
