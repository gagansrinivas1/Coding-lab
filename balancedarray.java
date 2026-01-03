import java.io.*;
import java.util.*;

public class balancedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:");
        int t = sc.nextInt();

        for (int cases = 1; cases <= t; cases++) {
            System.out.println("Enter");
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            int i;
            int prevsum = 0;

            for (i = 0; i < n; i++) {
                if ((sum - a[i]) == prevsum) {
                    System.out.println("YES");
                    break;
                }
                prevsum = prevsum + a[i];
                sum = sum - a[i];
            }

            if (i == n) {
                // recompute sum here instead of using decremented sum
                int total = 0;
                for (int j = 0; j < n; j++) {
                    total += a[j];
                }

                if (total == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
