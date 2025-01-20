package com.java.SingleTon;

public class SingleTon {
    private static SingleTon s=new SingleTon();
    private SingleTon(){

    }
    public static SingleTon getInstance(){
        return s;
    }

}
