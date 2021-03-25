package com.sparta.AMalcolm;

public class Printer {

    public static void PrintIsPalindrome(boolean isPalindrome, String word) {
        if (isPalindrome == true) {
            System.out.printf("\nThe word %s is a Palindrome.\n", word);
        }
        else {
            System.out.printf("\nThe word %s is not a Palindrome.\n", word);
        }
    }

    public static void PrintLongestPalindrome (String palindrome, String sentence) {
        System.out.printf("\n%s is the longest Palindrome in the sentence \"%s\".\n",palindrome, sentence);
    }
}
