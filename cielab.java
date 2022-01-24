package jff.practiceCC;

import java.util.Scanner;

public class cielab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int a= sc.nextInt();
            int b=sc.nextInt();
            int n=0;

            if(a>b)
                n=a-b;
            else
                n=b-a;

            int ld=n%10;
            if(ld==9)
            {
                n=n-1;
            }
            else
            {
                n=n+1;
            }
            System.out.println(n);
        }
    }
}
