package com.java.CustomException;

public class DevideByZero {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            devideByZero(a,b);
        }catch (DevideByZeroException ex){
           System.out.println(ex.getMessage());
        }
    }

    private static void devideByZero(int a, int b) {
        if(b==0){
            throw new DevideByZeroException("Zero cannot devident");
        }else{
            System.out.println(a=a/b);
        }
    }
}
