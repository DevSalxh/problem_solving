/*
 * ============================================================
 * Codeforces: B - Interesting Drink
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Determine how many shops Vasya can buy a drink from on each day,
 * given his budget for each day and the drink prices at n shops.
 *
 * Input:
 * n (number of shops), followed by n prices.
 * q (number of days/queries), followed by q daily coin amounts.
 *
 * Output:
 * For each day, the number of shops where the drink price is <= daily coins.
 *
 * Idea:
 * Sort the drink prices in ascending order. For each day's budget, use 
 * binary search (upper bound) to find the count of shops with prices less 
 * than or equal to the available coins in O(log n) time.
 *
 * Key conditions:
 * - prices[mid] <= coinBalance
 * - Upper bound index directly equals the number of affordable shops.
 *
 * Algorithm:
 * Read and sort the prices array. For each daily query, perform binary search 
 * to find the first index where prices[mid] > coins. Collect the resulting 
 * counts using a StringBuilder for fast output.
 *
 * Time Complexity: O((n + q) log n)
 * Space Complexity: O(n)
 * ============================================================
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static int upperBound(int[] prices, int coinBalance) {
        int low = 0;
        int high = prices.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] <= coinBalance) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shops = scanner.nextInt();

        int[] prices = new int[shops];
        for (int i = 0; i < shops; i++) {
            prices[i] = scanner.nextInt();
        }
        Arrays.sort(prices);
        int days = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < days; i++) {
            int coins = scanner.nextInt();
            int count = upperBound(prices, coins);
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}