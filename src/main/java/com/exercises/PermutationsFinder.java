package com.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eliud on 7/3/2017.
 */
public class PermutationsFinder {

    public static void main(String... args) {
        System.out.println(new PermutationsFinder().find("ABC"));
    }

    public List<String> find(String input) {
        List<String> permutations = new ArrayList<>();
        if (input == null) {
            return null;
        } else if (input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = input.charAt(0);
        String nextInput = input.substring(1);
        List<String> words = find(nextInput);
        for (String word : words) {
            for (int index = 0; index <= word.length(); index++) {
                permutations.add(charInsert(word, first, index));
            }
        }

        return permutations;
    }

    private String charInsert(String word, char first, int index) {
        String begin = word.substring(0, index);
        String end = word.substring(index);
        return begin + first + end;
    }

}
