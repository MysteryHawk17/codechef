package contest.cookoff;

import java.util.Arrays;
import java.util.Scanner;

public class meanmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
                sum=sum+arr[i];
            }
            if(n==1)
            {
                System.out.println(arr[0]);
            }
            else {


                Arrays.sort(arr);
                int usum = sum - sumar(arr, arr.length - 1);
            //    System.out.println(usum);
                double d1 = usum / (double)(n - 1);
                 // System.out.println(d1);
                double d2 = sumar(arr, arr.length - 1) / 1;
              //   System.out.println(d2);
                double res = d1 + d2;
                for (double i = arr.length - 2; i > 0; i--) {
                    usum = sum - sumar(arr, i);
                   // System.out.println(usum);
                    d1 = usum / i;
                    d2 = sumar(arr, i) / (arr.length - i);
                    double dess = d1 + d2;
                  //  System.out.println(dess);
                    if (dess > res)
                        res = dess;
                }
                System.out.println(res);

            }
        }
    }
    public static int sumar(int[] arr,double n)
    {
        int sum=0;
        for(int i=arr.length-1;i>=n;i--)
        {
            sum=sum+arr[i];
        }
        return (sum);
    }
}
