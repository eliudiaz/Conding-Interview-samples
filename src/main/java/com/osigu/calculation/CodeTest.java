package com.osigu.calculation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by eliud on 6/9/2017.
 */
public class CodeTest {

    public int solution(String S) {
        List<String> validCombinations = new LinkedList<String>();
        int groupSize = 1;
        int maxSizeGroup = S.length();
        while (groupSize <= maxSizeGroup) {
            int cycles = (maxSizeGroup / groupSize);
            int currentIndex = 0;
            for (int i = 0; i <= cycles; i++) {
                String test = S.substring(currentIndex, currentIndex + groupSize );
                currentIndex = currentIndex + groupSize;
                String result = reverse(test);
                if (test.equalsIgnoreCase(result)) {
                    validCombinations.add(test);
                }
            }
            groupSize += groupSize;
        }
        return validCombinations.size();
    }

    private String reverse(String input) {
        StringBuilder out = new StringBuilder();
        out.append(input);
        return out.reverse().toString();
    }

    public static void main(String... arg) {
        System.out.println(new CodeTest().solution("02002"));
    }
}
