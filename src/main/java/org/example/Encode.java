package org.example;

public class Encode {
    public static String encrypt(String text, int key ) {
        String cipher = " ";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isUpperCase(letter)) {
                int x = letter - 'A' + key;

                x %= 26;

                letter = (char) (x + 'A');

            }
        }
    }