package com.java.CustomException;

public class ExceptionExample {

    public static void main(String[] args) {
        try{
           throw new MyException("it my exception");
        }catch (MyException ex){
           System.out.println(ex.getMessage());
        }
    }
}
