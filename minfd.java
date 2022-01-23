package contest.long2jan;

import java.util.Arrays;
import java.util.Scanner;

public class minfd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            t--;
            int n= sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int i=-1;
            int sum=0;
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]>k)
                    i=j;
            }
            if(i==-1)
            {
                for(int j=n-1;j>=0;j--)
                {
                    sum=sum+arr[j];
                    c++;
                    if(sum>=k)
                        break;
                }
                if(sum>=k)
                System.out.println(c);
                else
                    System.out.println(-1);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}
