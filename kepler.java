package contest.longjan;

import java.util.Scanner;

public class kepler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t<1||t>10000)
        {
            t=sc.nextInt();
        }
        while(t>0)
        {
            double t1=sc.nextDouble();
            while(t1<1||t1>10)
            {
                sc.nextDouble();
            }
            double t2=sc.nextDouble();
            while(t2<1||t2>10)
            {
                sc.nextDouble();
            }
            double r1=sc.nextDouble();
            while(r1<1||r1>10)
            {
                sc.nextDouble();
            }
            double r2=sc.nextDouble();
            while(r1<1||r2>10)
            {
                sc.nextDouble();
            }
            if(Math.pow(t1,2.0)/Math.pow(t2,2.0)==Math.pow(r1,3.0)/Math.pow(r2,3.0))
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
            t--;
        }
    }
}
