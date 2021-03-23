package com.sparta.AMalcolm;

public class LargestOfThreeNumbers {

    public static void largestNumber(int numberOne, int numberTwo, int numberThree){
        if( numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.printf("The numbers entered were: %d, %d, %d.\nThe largest number is %d \n", numberOne, numberTwo, numberThree, numberOne);
        }
        else if( numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.printf("The numbers entered were: %d, %d, %d.\nThe largest number is %d \n", numberOne, numberTwo, numberThree, numberTwo);
        }
        else if( numberThree >= numberOne && numberThree >= numberTwo) {
            System.out.printf("The numbers entered were: %d, %d, %d.\nThe largest number is %d \n", numberOne, numberTwo, numberThree, numberThree);
        }
    }
}
