package jff.practiceCC;

import java.util.Scanner;

public class FACTRL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;;
            long n=sc.nextLong();
            long c=0;
            int i=0;
            while(n>=(long)Math.pow(5,i))
            {
                c=c/(long) Math.pow(5,i);
                i++;
            }
            System.out.println(c);
        }
    }
}
