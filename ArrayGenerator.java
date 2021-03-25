package com.sparta.AMalcolm;

public class ArrayGenerator {

    public static int[][] arrayInitialiser2DWithID(int length) {
        int[][] array = new int[length][2];
        for (int i = 0; i < length; i++) {
            array[i][0] = i;
            array[i][1] = 0;
        }
        return array;
    }

}
