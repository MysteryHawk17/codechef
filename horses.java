package jff.practiceCC;

import java.util.Arrays;
import java.util.Scanner;

public class horses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {

            t--;

            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int dif=0-(arr[0]-arr[1]);
            for(int j=1;j<n-1;j++)
            {
                int c=0-(arr[j]+arr[j+1]);
                if(c<dif)
                    dif=c;
            }
            System.out.println(dif);
        }
    }
}
