package contest.cookoff;

import java.util.Scanner;

public class nopal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            String s="";
            int ch=97;
            for(int i=1;i<=n;i++)
            {
                s=s+Character.toString((char)ch);
                ch++;
                if(ch>122)
                    ch=97;
            }
            System.out.println(s);
        }
    }
}
