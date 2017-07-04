package com.osigu.calculation;

import java.util.Arrays;

/**
 * Created by eliud on 6/23/2017.
 */

public class PermutationDup {

    public void permutation(String s) {
        char[] original = s.toCharArray();
        Arrays.sort(original);
        char[] clone = new char[s.length()];
        boolean[] mark = new boolean[s.length()];
        Arrays.fill(mark, false);
        permute(original, clone, mark, 0, s.length());
    }

    private void permute(char[] original, char[] clone, boolean[] mark, int length, int n) {
        if (length == n) {
            System.out.println(clone);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == true) continue;
            // dont use this state. to keep order of duplicate character
            if (i > 0 && original[i] == original[i - 1] && mark[i - 1] == false) continue;
            mark[i] = true;
            clone[length] = original[i];
            permute(original, clone, mark, length + 1, n);
            mark[i] = false;
        }

    }

    public static void main(String[] args) {
        PermutationDup p = new PermutationDup();
        p.permutation("abcab");
    }
}