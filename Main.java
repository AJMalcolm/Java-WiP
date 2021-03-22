package com.sparta.AMalcolm;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int program = 0;
        int _continue = 1;
        Scanner input = new Scanner(System.in);
        while(_continue == 1) {
            System.out.printf("Options:\n1: Loop Program\n2: Largest of Three Numbers\n3: Fibonacci Series Generator\n4: Prime Number Checker\n");
            System.out.println("Please enter 1, 2, 3 or 4 to see a program:");
            program = input.nextInt();
            switch (program) {
                case 1:
                    loopProgram();
                    break;
                case 2:
                    largestNumber();
                    break;
                case 3:
                    fibonacciGenerator();
                    break;
                case 4:
                    pNumberChecker();
                    break;
                default:
                    throw new IllegalStateException(program + " is not an appropriate option.");
            }
            System.out.println("\nWould you like to go again?\nEnter 1 for YES or any other number for NO:");
            _continue = input.nextInt();
        }
    }

    public static void loopProgram(){
        int loop = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Options:\n1: For Loop\n2: While Loop\n3: Do While Loop\n4: Advanced Loop\n");
        System.out.println("Please enter 1, 2, 3 or 4 to see a loop:");
        loop = input.nextInt();
        switch (loop){
            case 1:
                Loops.forLoop();
                break;
            case 2:
                Loops.whileLoop();
                break;
            case 3:
                Loops.doWhileLoop();
                break;
            case 4:
                Loops.advancedForLoop();
                break;
            default:
                System.out.println("Please enter the correct value");
                break;
        }
    }

    public static void largestNumber(){
        int numberOne = 5;
        int numberTwo = -2;
        int numberThree = 40;

        Scanner input = new Scanner(System.in);
        System.out.println("If you would like to enter custom numbers, enter 1 now. Enter any other number to continue:");
        int Choice = input.nextInt();

        switch(Choice){
            case 1:
                System.out.println("Please enter your first number: ");
                numberOne = input.nextInt();
                System.out.println("Please enter your second number: ");
                numberTwo = input.nextInt();
                System.out.println("Please enter your third number: ");
                numberThree = input.nextInt();
                LargestOfThreeNumbers.largestNumber(numberOne, numberTwo, numberThree);
                break;
            default:
                LargestOfThreeNumbers.largestNumber(numberOne, numberTwo, numberThree);
                break;
        }
    }

    public static void fibonacciGenerator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of terms for the fibonacci sequence:");
        int noTerms = input.nextInt();
        FibonacciSeriesGenerator.fibonacci(noTerms);
    }

    public static void pNumberChecker(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive whole number:");
        int maybePrime = input.nextInt();
        PrimeNumberChecker.PrimeChecker(maybePrime);
    }
}
