package contest.starters23;

import java.util.Scanner;

public class maxvac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x= sc.nextInt();
            int vac=0;
            String cal= sc.next();
            String s="";
            for(int i=0;i<x;i++)
            {
                s=s+"0";
            }
            StringBuilder sb=new StringBuilder(cal);
            while(cal.contains(s))
            {
                vac++;
                sb.delete(cal.indexOf(s),cal.indexOf(s)+x);
                cal=sb.toString();
            }
           // System.out.println(vac);
            for(int i=0;i<s.length();i++)
            {
                StringBuilder sbs=new StringBuilder(s);
                sbs.setCharAt(i, '1');
                String s1=sbs.toString();
                int change=0;
                if(cal.contains(s1))
                {
                    change=1;
                    vac++;
                    sb.delete(cal.indexOf(s1),cal.indexOf(s1)+x);
                    cal=sb.toString();
                 //   System.out.println(vac);
                }

                if(change==1)
                    break;
            }
            System.out.println(vac);
        }
    }
}
