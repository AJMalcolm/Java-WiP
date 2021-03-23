package com.sparta.AMalcolm;

public class BubbleSort {

    public static void IntArraySorterAsc(int[] inputArray) {

        // Sorter for an array of integers in ascending order (left to right)

        int[] sortingArray = inputArray;
        int placeholder = 0;
        int counter = 0;
        boolean complete = false;

        System.out.printf("\nHere is the initial input array:\n");
        for (int i = 0; i < inputArray.length; i++) {
            if(i == inputArray.length-1) {
                System.out.printf("%d.", inputArray[i]);
            }
            else{
                System.out.printf("%d, ", inputArray[i]);
            }
        }

        while (complete == false) {
            for (int j = 0; j < sortingArray.length; j++) {
                if (j == (sortingArray.length - 1)) {
                    counter++;
                }
                else if (sortingArray[j + 1] < sortingArray[j]) {
                    placeholder = sortingArray[j];
                    sortingArray[j] = sortingArray[j + 1];
                    sortingArray[j + 1] = placeholder;
                } else if (sortingArray[j + 1] >= sortingArray[j]) {
                    counter++;
                }
            }
            if(counter == (sortingArray.length)) {
                complete = true;
            }
            else{
                counter = 0;
                placeholder = 0;
            }
        }
        System.out.printf("\nHere is the array in ascending order:\n");
        for (int k = 0; k < sortingArray.length; k++) {
            if(k == sortingArray.length-1) {
                System.out.printf("%d.", sortingArray[k]);
            }
            else{
                System.out.printf("%d, ", sortingArray[k]);
            }
        }
        System.out.printf("\n");
    }
}
