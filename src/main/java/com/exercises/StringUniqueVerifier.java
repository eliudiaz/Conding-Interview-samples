package com.exercises;

/**
 * Created by eliud on 7/3/2017.
 */
public class StringUniqueVerifier {

    public static void main(String[] args) {
        System.out.println("is it unique? " + new StringUniqueVerifier().verify("abisai"));
    }

    /**
     * 1. count every character frequency
     * 2. if any is bigger than 1 it is not unique
     *
     * @param input
     * @return
     */
    public boolean verify(String input) {
        int[] characters = new int[26]; //english letters
        for (int index = 0; index < input.length(); index++) {
            int charCode = (int) input.charAt(index) - (int) 'a';
            int current = characters[charCode];
            current++;
            if (current > 1) {
                return false;
            }
            characters[charCode]=current;
        }
        return true;
    }


}
