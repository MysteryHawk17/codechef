package contest.lunchtime;

import java.util.Scanner;

public class prez {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
        int n= sc.nextInt();
            int n00=0;
        int k= sc.nextInt();
        String s=sc.next();
            if(s.indexOf("0")==0) {
                n00++;
                System.out.println("main execute hua");
                System.out.println(n00);
            }
        int si=Integer.parseInt(s);

        while(si%10==0) {
            si = si / 10;
            n00++;
        }


        String ns=Integer.toString(si);
        int c=0;
        for(int i=ns.length();i>0;i--)
        {
            String ss=ns.substring(0,i);
            System.out.println(ss+"*/*/");
            if(value(ss,k)) {
                System.out.println(i+n00);
                c++;
                break;
            }

        }
        if(c==0)
        {
            System.out.println(0+n00);
        }

        }
    }
    public static boolean value(String s,int k)
    {
        int l=s.length();
        int n=0;
        int num=Integer.parseInt(s);
        int c=0;
        while(k>0)
        {

            k=k-(10-((num+n)%10));
            if(k<0)
                break;
            else
                c++;
            System.out.println(k);
            n=n+(10-((num+n)%10));
            System.out.println(n);
            num=num/10;
            System.out.println(num);

            if(num==0)
                break;

        }
        if(c==l||num==0)
            return (true);
        else
            return (false);
    }
   /* public static String value(String s,int k)
    {
        StringBuilder sb= new StringBuilder(s);
        int l=s.length();
        while(l!=1)
        {
            int rem=10-Integer.parseInt(s.substring(l-1,l));
            k=k-rem;
            for(int i=0;i<l-1;i++)
            {
                if(k<=0)
                    break;
                else
                {
                    int n=(Integer.parseInt(s.substring(i,i+1))+rem)%10;

                    sb.replace(i,i+1,Integer.toString(n));
                }
            }
            l=l-1;
        }
        return (sb.toString());
    }*/
}
/*
            int n= sc.nextInt();
            int k=sc.nextInt();
            String s= sc.next();
            String s0="";
            for(int i=0;i<n;i++)
            {
                s+=s0+"0";
            }
            StringBuilder sb=new StringBuilder(s);
            StringBuilder sb2=new StringBuilder(s0);

            for(int i=s.length();i>0;i--)
            {
                String ss=value(s,k);
                if(ss.indexOf(s0)==0)
                    System.out.println(i-1);
                sb2.
                //sb2.delete(i-2,i-1);
                s0=sb2.toString();
                sb.delete(i-2,i-1);
            }
 */

