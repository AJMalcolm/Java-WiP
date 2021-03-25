package com.sparta.AMalcolm;

public abstract class WordClass {
    private static int wordID;
    private String value;
    private int wordLength;
    private static boolean isPalindrome;

    static{
        isPalindrome = false;
        wordID = 0;
    }

    {
        wordID++;
    }

    public WordClass(String value, int wordLength) {
        this.value = value;
        this.wordLength = wordLength;
        this.isPalindrome = isPalindrome;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getWordLength() {
        return wordLength;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    public static boolean getIsPalindrome() {
        return isPalindrome;
    }

    public static void setIsPalindrome(boolean isPalindrome) {
        WordClass.isPalindrome = isPalindrome;
    }

    public static int getWordID() {
        return wordID;
    }

    @Override
    public String toString() {
        return "WordClass{" +
                "value='" + value + '\'' +
                '}';
    }
}
