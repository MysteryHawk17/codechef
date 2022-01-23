package contest.long2jan;

import java.util.Scanner;

public class sumandor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            int x=sc.nextInt();
            int s=sc.nextInt();
            if(x==1)
            {
                System.out.println(s);
            }
            else if(x%2==0)
            {
                if(s%2==0)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(-1);
                }
            }
            else
            {
                if(s%2==0)
                {
                    System.out.println(2);
                }
                else
                {
                    if(x==s)
                        System.out.println(1);
                    else
                    System.out.println(3);
                }

            }
        }
    }
}
