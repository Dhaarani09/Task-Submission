package com.practise.com.string;

import java.util.Arrays;

public class LambdaSortDemo {
	public static void main(String[] args) {
        // Lambda expression to sort strings
        StringSorter sorter = (arr) -> {
            Arrays.sort(arr);
            return arr;
        };

        // Test it
        String[] names = {"Swapna", "Raj", "Anu", "Sam"};
        String[] sortedNames = sorter.sortStrings(names);

        System.out.println("Sorted Strings: " + Arrays.toString(sortedNames));
    }

}
