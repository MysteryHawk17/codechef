package contest.starters22;

import java.util.Scanner;

public class intseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int k = sc.nextInt();
            if (k % 2 != 0)
                System.out.println(0);
            else {
                double n =  (Math.log10(k) / Math.log10(2));
                if(n==(int)n)
                System.out.println(n);
                else {
                    int f = 1;
                    while ((k / Math.pow(2, f))%2==0)
                    {
                        f++;
                    }
                        System.out.println(f);
                }
            }
        }
    }
}