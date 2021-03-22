package com.sparta.AMalcolm;

public class FibonacciSeriesGenerator {
    public static void fibonacci(int noTerms)
    {
        if(noTerms == 1)
        {
            System.out.printf("The first term of the fibonacci sequence is: 1\n");
        }
        else {
            System.out.printf("The first %d terms of the fibonacci sequence are:\n", noTerms);
            int previousPreviousValue = 0;
            int previousValue = 0;
            int currentValue = 1;
            for (int i = 0; i < noTerms; i++) {
                if(i == noTerms - 1)
                {
                    System.out.printf("%d.\n", currentValue);
                }
                else {
                    System.out.printf("%d, ", currentValue);
                    previousPreviousValue = previousValue;
                    previousValue = currentValue;
                    currentValue = previousValue + previousPreviousValue;
                }
            }
        }
    }
}
