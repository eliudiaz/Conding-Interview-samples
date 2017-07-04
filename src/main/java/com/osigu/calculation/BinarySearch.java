package com.osigu.calculation;


/**
 * Created by edcracken on 04/07/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(new BinarySearch().search(new Integer[]{1, 2, 3, 4, 5, 5, 6, 8, 8, 10,11,12,13,14,15,16,17,18,19,20}, null, null, 10));
    }

    public Integer search(Integer[] array, Integer begin, Integer end, Integer query) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("invalid array input!");
        }
        if (begin == null) {
            begin = 0;
        }
        if (end == null) {
            end = array.length;
        }
        Integer middle = (begin + end) / 2;
        Integer guess = array[middle];
        if (guess == query) {
            return guess;
        } else if (query > guess) {
            return search(array, middle, end, query);
        } else {
            return search(array, begin, middle, query);
        }
    }
}
