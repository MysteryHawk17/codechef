package contest.starters24;

import java.util.Scanner;

public class orandcon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            /*long n=sc.nextInt();
            String nbs=Long.toBinaryString(n);
            long nbi=Long.parseLong(nbs);
            long n2=(1<<28)|nbi;
            long n3=(1<<29)|nbi;
            System.out.print(n+" "+binToDec(Long.toString(n2))+" "+binToDec(Long.toString(n3)));
            System.out.println("");*/
            long n=sc.nextLong();
            long a=n;
            long b=n|(1<<28);
            long c=n|(1<<29);
            System.out.print(a+" "+b+" "+c);
            System.out.println("");
        }

    }
  /*  public static long binToDec(String bn) {


        String[] arr = bn.split("");
        lonng dn = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].equalsIgnoreCase("1")) {
                dn = dn + (int) Math.pow(2.0, arr.length - 1 - i);
            }
        }
        return(dn);
    }*/
}
