package contest.starters22;

import java.util.ArrayList;
import java.util.Scanner;

public class eor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            int n= sc.nextInt();
            int c=3;
            ArrayList<Integer> list=new ArrayList<>();
            while(list.size()!=n)
            {
                if(checkgood(c))
                {
                    list.add(c);
                }
                c++;
            }
            System.out.print(list.toString().replace("[","").replace("]","").replace(",",""));
            System.out.println("");
        }
    }

  public static boolean checkgood(int n)
  {
      int c=0;
    while(n>0)
    {
        if(n%2==1)
        c++;
        n=n/2;
    }
    if(c%2==0)
        return(true);
    else
        return (false);
  }
}
