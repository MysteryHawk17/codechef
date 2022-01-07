package contest.longjan;

import java.util.Scanner;

public class covidsp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n= sc.nextLong();
            while(n<1||n>100000000)
            {
                n= sc.nextLong();
            }
            long d= sc.nextLong();
            while(d<1||d>100000000)
            {
                d= sc.nextLong();
            }
            double sp=0;


            if(d<=10)
            {
                sp=Math.pow(2.0,d);
            }
            else
            {
                double s1=Math.pow(3,d-10);
                sp=1024*s1;
            }
            if(sp<n)
                System.out.println((long)sp);
            else
                System.out.println((long)n);
        }
    }
}
