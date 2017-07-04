package com.exercises;

/**
 * Created by eliud on 7/3/2017.
 */
public class StringPermutationVerifier {

    public static void main(String[] args) {
        System.out.println("is it a permutation? " + new StringPermutationVerifier().isPermutation("roma", "amor"));
    }

    /**
     * 1. if their size is not equals return false
     * 2. convert both strings to character's array
     * 3. sum every character code and if both results are equals it is a permutation
     *
     * @param a
     * @return
     */
    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int sumCurrent = 0, sumCandidate = 0;
        for (int index = 0; index < a.length(); index++) {
            sumCurrent += (int) a.charAt(index);
            sumCandidate += (int) b.charAt(index);
        }
        return sumCandidate == sumCurrent;
    }

    // O(a)


}
