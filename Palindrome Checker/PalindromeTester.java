package com.sparta.AMalcolm;

public class PalindromeTester {

    public static void PalindromeCheck(Word query){

        int correctChars = 0;
        char[] chars = new char[query.getWordLength()];

        for (int i = 0; i < query.getWordLength(); i++) {
            chars[i] = query.getValue().charAt(i);
        }


        int j;
        int k = query.getWordLength()-1;

        for(j = 0; j < query.getWordLength(); j++, k--) {
            if (chars[j] == chars[k]) {
                //The corresponding characters are the same
                correctChars++;
            }
            else {
                //The corresponding characters are different
                break;
            }
        }

        if(correctChars == query.getWordLength()) {
            query.setIsPalindrome(true);
        }
    }
}
