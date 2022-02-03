package contest.starters23;

import java.util.ArrayList;
import java.util.Scanner;

public class subarrayxor {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            ArrayList<Integer> list=new ArrayList<>();
            int n= sc.nextInt();
            list.add(2);
            list.add(3);
            for(int i=2;i<n;i++)
            {
                list.add(xor(list)+1);
            }
            System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
        }
    }
    public static int xor(ArrayList<Integer> list)
    {
        int re=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            re=re^list.get(i);
        }
        return (re);
    }
}
