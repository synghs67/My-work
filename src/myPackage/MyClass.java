package myPackage;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
       int n = 123454344;

     //int str = Integer.parseInt ( nr );
     int count = 0;
        while(n>0){
         int rem = n % 10;
         if (rem==4) {
             count++;
         }
           n /= 10;
     }
        System.out.println (count);
    }
}
