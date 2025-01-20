package com.java.Logical;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        int n = 15;
        printPrime(n);
    }

    private static void printPrime(int n) {

        int x,z;


        for (x = 0; x <= n; x++) {


            if (x == 0 || x == 1)
                continue;
            int flag = 1;
            for (z = 2; z <= x/2; z++) {
                if (x % z == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag != 0) {
                System.out.println(x);
            }


        }


    }
}
