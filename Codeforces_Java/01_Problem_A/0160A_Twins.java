/*
 * ============================================================
 * Codeforces: A - Twins
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Given the values of coins, choose the minimum number of coins
 * such that their sum is strictly greater than the sum of all
 * remaining coins.
 *
 * Input:
 * n followed by n coin values.
 *
 * Output:
 * Minimum number of coins required.
 *
 * Idea:
 * To reach the required sum using the fewest coins, take the
 * largest coins first.
 *
 * Algorithm:
 * 1. Calculate the total sum.
 * 2. Sort the coins in descending order.
 * 3. Keep taking the largest coins until our sum becomes
 *    greater than the remaining sum.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * ============================================================
 */

import java.util.Arrays;
import java.util.Scanner;

public class A160_Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] coins = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }

        Arrays.sort(coins);

        int mySum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            totalSum -= coins[i];
            count++;

            if (mySum > totalSum)
                break;
        }

        System.out.println(count);
    }
}