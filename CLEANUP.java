package jff.practiceCC;

import java.util.Scanner;

public class CLEANUP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=i+1;
            }
            int m=sc.nextInt();
            for(int i=0;i<m;i++)
            {
                int mi=sc.nextInt();
                arr[mi-1]=0;
            }
            int[] wl=new int[n-m];
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0) {
                    wl[c] = arr[i];
                    c++;
                }
            }

          /*  for(int i=0;i<wl.length;i++)
                System.out.println(wl[i]);*/
            int cw=0;
            int aw=0;
            for(int j=0;j< wl.length;j+=2)
            {
                System.out.print(wl[j]+" ");
                cw++;
            }
            if(cw==0)
                System.out.println(" ");
            else
                System.out.println("");
            for(int k=1;k< wl.length;k+=2)
            {
                System.out.print(wl[k]+" ");
                aw++;
            }
            if(aw==0)
                System.out.println(" ");
            else
                System.out.println("");

        }
    }
}
