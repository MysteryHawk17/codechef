package contest.lunchtime;

import java.util.Scanner;

public class subperm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n!=1&&k==1)
                System.out.println(-1);
            else if(n==1&&k==1)
                System.out.println(1);
            else if(n==k)
            {
                for(int i=1;i<=k;i++)
                    System.out.print(i+" ");
                System.out.println("");
            }
            else
            {
                int i=1;
                while(i<k)
                {
                    System.out.print(i+" ");
                    i++;
                }
                for(int j=n;j>=k;j--)
                    System.out.print(j+" ");

                System.out.println("");

            }
        }
    }
}
