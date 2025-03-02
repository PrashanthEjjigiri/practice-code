package com.java;

import java.sql.SQLOutput;
import java.util.*;

public class ComparatorMainClass {
    public static void main(String[] args) {
        List<Student> employees = new ArrayList<>();
        employees.add(new Student(1, "Alice", 23));
        employees.add(new Student(2, "Bob", 45));
        employees.add(new Student(3, "Charlie", 13));

    Collections.sort(employees, new MyComparator());
        System.out.println(employees);

    }


}
