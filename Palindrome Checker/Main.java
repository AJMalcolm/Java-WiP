package com.sparta.AMalcolm;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a word or sentence:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        //String inputString = "Hello, my old FFFRFFF bob OYJKHGHKJYO";

        if(inputString.length() < 3 || inputString == null || inputString.isEmpty()) {
            System.out.println("The string must be at least 3 characters long.");
            System.exit(0);
        }

        // Splits the input string into an array of single word strings
        String[] wordsArray = inputString.split(" ");
        int numberOfWords = wordsArray.length;

        Word[] wordObjectsArray = new Word[numberOfWords];
        // Creates an initialised array of the appropriate size with wordID's and 0's for word length.
        int[][] palindromeWordLengths = ArrayGenerator.arrayInitialiser2DWithID(numberOfWords);
        int i = 0;

        for (String word : wordsArray)
        {
            //Creates a word object labelled "query" for each word within the "wordsArray"
            Word query = new Word(word, word.length());
            PalindromeTester.PalindromeCheck(query);
            wordObjectsArray[i] = query;
            System.out.printf("\nThe word: %s (ID: %d) is a Palindrome? %s!\n", query.getValue(), query.getWordID(), query.getIsPalindrome());
            if(query.getIsPalindrome() == true) {
                //If the word is a palindrome, adds the word length to the palindromeWordLengths array at the appropriate record (corresponding to ID)
                palindromeWordLengths[i][1] = query.getWordLength();
            }
            i++;
        }

        // Passes the array "palindromeWordLengths" to the "getIndexOfLargest" method, returns the position within the array of the longest string (largest palindrome). Returns -1 if there are no Palindromes.
        int positionOfLargestPalindrome = GetArrayIndex.getIndexOfLargest(palindromeWordLengths);

        if(positionOfLargestPalindrome == -1)
        {
            System.out.printf("\nThere are no Palindromes.\n");
        }
        else{
            System.out.printf("\nThe largest Palindrome in the string \"%s\" is %s.\n", inputString, wordsArray[palindromeWordLengths[positionOfLargestPalindrome][0]]);
        }
    }
}
