package com.java.Logical;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");

        int num = sc.nextInt();
        int temp,arm = 0;
        temp=num;

        for (int i = num; i > 0; i=i/10) {
            int r = i % 10;
            arm=arm+r*r*r;
        }
if(temp==arm){
    System.out.println("Yes");
}else{
    System.out.println("No");
}*/
     for (int num=1;num<=500;num++){
         int temp,arm=0;
         temp=num;

         for(int i=num;i>0;i=i/10){
             int r=i%10;
             arm=arm+r*r*r;
         }
         if(temp==arm){
             System.out.println(arm+"yes");
         }
     }


    }
}
