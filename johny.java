package jff.practiceCC;

//import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Scanner;

public class johny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            int kl=arr[k-1];
            Arrays.sort(arr);
            int index=0;/*Ints.indexOf(arr,kl);*/
            System.out.println(index+1);
        }
    }
}
