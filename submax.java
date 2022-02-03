package contest.starters23;

import java.util.Scanner;

public class submax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (x > k) {
                System.out.println(-1);
            } else {
                int c = 0;
                for (int i = 1; i <= n; i++) {
                    System.out.print(c + " ");
                    c++;
                    if (c >= x) {
                        c = 0;
                    }
                }
                System.out.println("");
            }
        }
    }
}