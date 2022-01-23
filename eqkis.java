package contest.starters22;

import java.util.Scanner;

public class eqkis
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            if(n%2==0&&n!=2)
            {
                System.out.println("yes");

                System.out.print(n-1+" ");
                for(int i=1;i<n-1;i+=2)
                {
                    System.out.print(i+" ");
                }
                for(int i=n;i>0;i=i-2)
                {
                    System.out.print(i+" ");
                }
                System.out.println("");
            }
            else if(n%2!=0)
            {
                System.out.println("Yes");
                for(int i=1;i<=n;i+=2)
                {
                    System.out.print(i+" ");
                }
                for(int i=n-1;i>0;i=i-2)
                {
                    System.out.print(i+" ");
                }
                System.out.println("");
            }
            else if(n==2)
            {
                System.out.println("No");
            }
        }

    }
}
