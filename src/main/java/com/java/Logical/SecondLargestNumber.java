package com.java.Logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Integer i = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
System.out.println(i);
    }
}
