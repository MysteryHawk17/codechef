package contest.long2jan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class powsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            int[] arr=new int[n];
            int[] arr2=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                int s=sc.nextInt();
                list.add(s);
                sum=sum+s;
                arr2[i]=s;
            }
            double logg=Math.log10(sum)/Math.log10(2);
            int max=(int)Math.ceil(logg);
            Arrays.sort(arr2);
            if(logg==(int)logg)
            {
                System.out.println(0);
            }

            else
            {
                /* int req=(int) Math.pow(2.0,max)-sum;

                int y=req/arr2[0];
                System.out.println("1");
                System.out.println("1 "+(y+1));
                int index=list.indexOf(arr2[0]);
                System.out.println(index+1);*/
                System.out.println(Math.pow(2,max));
                int req=(int) Math.pow(2.0,max)-(sum-arr2[0]);
                System.out.println(req);

                int y=req/arr2[0];
                System.out.println("1");
                System.out.println("1 "+y);
                int index=list.indexOf(arr2[0]);

                //index= list.indexOf(arr2[arr2.length-2]);
                System.out.println(index+1);
            }
        }
    }
}
