package myPackage;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter number for find  how many double 4 are there");
        //int count = 0;
        int n = in.nextInt ();
        while (n>0) {
          int  rem = n % 10;
           if (rem ==4); {
              n++;
            }
            n /=10;
        }
        System.out.println (n);
    }
}
