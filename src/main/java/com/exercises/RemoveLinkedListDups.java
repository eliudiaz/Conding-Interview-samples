package com.exercises;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by eliud on 7/3/2017.
 */
public class RemoveLinkedListDups {

    public static void main(String[] args) {
        LinkedList<String> dups = new LinkedList<>();
        dups.add("h");
        dups.add("h");
        dups.add("a");
        dups.add("b");
        System.out.println(new RemoveLinkedListDups().getNonDups(dups));

    }

    public String[] getNonDups(LinkedList<String> input) {
        HashSet<String> nonDups = new HashSet<>();
        for (String item : input) {
            if (!nonDups.contains(item)) {
                nonDups.add(item);
            }

        }
        return nonDups.toArray(new String[nonDups.size()]);

    }


}
