package com.dojo.array;

public class ArrayLesson03 {
    public static void main(String[] args) {

        int[][] days = new int[3][3];

        days[0][0] = 1;
        days[0][1] = 15;
        days[0][2] = 10;

        days[1][0] = 2;
        days[1][1] = 22;
        days[1][2] = 12;

        for (int i = 0; i < days.length; i++){
            for (int j = 0; j < days[i].length; j++)
                System.out.println(days[i][j]);
        }
    }
}
