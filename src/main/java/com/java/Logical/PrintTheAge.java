package com.java.Logical;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PrintTheAge {

    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)){
              System.out.println("Enter Your Birthday Date");

            String s = scanner.nextLine();

            LocalDate birthDate = LocalDate.parse(s);

            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthDate, currentDate);

            System.out.println("You Age :"+ age.getYears());

        }
    }
}
