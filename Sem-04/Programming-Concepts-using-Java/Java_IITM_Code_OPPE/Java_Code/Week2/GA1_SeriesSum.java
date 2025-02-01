package Week2;

// Write a program to find the sum of the following series up to n terms.
// 1^2 + ( 1^2 + 2^2 ) + ( 1^2 + 2^2 + 3^2 ) + ......... + ( 1^2 + 2^2 + .... + n^2 )

import java.util.*;

public class GA1_SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Fill your code here
        int sum = 0;
        int subsum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                subsum = subsum + (int) (Math.pow(j, 2));
            }
            sum += subsum;
            subsum = 0;
        }
        System.out.println(sum);

    }
}