package com.java.CustomException;

public class ValidateAge{
    public static void main(String[] args) throws ValidateAgeException {


        int age=17;
        validateAge(age);

    }

    private static void validateAge(int age) throws ValidateAgeException {

            if(age>18){
                System.out.println("it Valid Age");
            }else{
                throw new ValidateAgeException("its not valid age");
            }

    }
}
