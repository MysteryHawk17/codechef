package contest.cookoff;

import java.util.ArrayList;
import java.util.Scanner;

public class seqdiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            ArrayList<Integer> list=new ArrayList<>();

            int n= sc.nextInt();
            for(int i=1;i<=500;i++)
            {
               list.add(i);

            }
            for(int i=1;i<500;i+=2)
            {
                int temp=list.get(i-1);
                list.set(i-1,list.get(i));
                list.set(i,temp);
            }
           for(int i=0;i<n;i++)
           {
               System.out.print(list.get(i)+" ");
           }
            System.out.println("");
        }
    }

}
