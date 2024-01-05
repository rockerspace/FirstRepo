package com.excelon.app;



public class activity2 {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitive check
        return "aeiou".indexOf(ch) != -1; // Efficiently check if ch is in the vowels string
    }

    public static void main(String[] args) {
        char letter = 'E'; // Letter to check

        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is a consonant");
        }
    }
}



