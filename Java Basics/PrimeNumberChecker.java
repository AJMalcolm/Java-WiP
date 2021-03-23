package com.sparta.AMalcolm;

public class PrimeNumberChecker {

    public static void PrimeChecker(int maybePrime){
        int value = 1;
        int _continuecheck = 1;
        int i = 2;

        while(_continuecheck == 1 && i < maybePrime)
        {
            value = maybePrime%i;
            if(value == 0){
                _continuecheck = 0;
                System.out.printf("%d is not a prime number.\n", maybePrime);
                break;
            }
            i++;
        }
        if(_continuecheck == 1) {
            System.out.printf("%d is a prime number.\n", maybePrime);
        }
        else{
            System.out.printf("Something went wrong.\n");
        }
    }
}
