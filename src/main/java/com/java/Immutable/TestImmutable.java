package com.java.Immutable;

public class TestImmutable {
    public static void main(String[] args) {
        Immutable im1=new Immutable("abc");

        String im2=im1.validatePanCardNumber("abcd");
        String im5=im1.validatePanCardNumber("abcd");
        String im3=im1.validatePanCardNumber("abc");
        String im4=im1.validatePanCardNumber("abc");

        System.out.println(im2.hashCode());
        System.out.println(im5.hashCode());
        System.out.println(im3.hashCode());
        System.out.println(im4.hashCode());

    }
}
