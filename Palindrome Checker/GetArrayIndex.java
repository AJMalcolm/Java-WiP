package com.sparta.AMalcolm;

public class GetArrayIndex {

    public static int getIndexOfLargest( int[][] array )
    {
        if ( array == null || array.length == 0 ){
            return -1; // null or empty
        }
        else{
            int largest = 0;
            for ( int i = 1; i < array.length; i++ )
            {
                if ( array[i][1] > array[largest][1] ){
                    largest = i;
                }
            }
            return largest; // position of the first largest found
        }
    }
}
