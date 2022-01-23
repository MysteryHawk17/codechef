package contest.long2jan;

import java.util.Scanner;

public class orcalculattoy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=0;
        if(n%2==0) {
            for (int j = 0; j < n - 1; j++) {

                d = arr[j] | arr[j + 1];
                j++;
            }
        }
        else
        {
            for (int j = 0; j < n - 1; j++) {

                if(j==n-1)
                    break;
                d = arr[j] | arr[j + 1];
                j++;
            }
            d=d|arr[n-1];
        }
        System.out.println(d);


    }
}
