package contest.long2jan;

import java.util.ArrayList;
import java.util.Scanner;

public class crycolr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int[][] arr=new int[3][3];
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }

            int c=0;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println("");
            }
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(i!=j)
                    {
                        c=c+arr[i][j];
                        arr[j][i]=0;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
