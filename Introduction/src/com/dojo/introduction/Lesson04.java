package com.dojo.introduction;

public class Lesson04 {
    public static void main(String[] args) {

        double salary = 4000;
        String donate = "I will donate 500 dollars";
        String notDonate = "I will not donate money";

        String result = salary > 5000 ? donate : notDonate;

        System.out.println(result);

    }
}
