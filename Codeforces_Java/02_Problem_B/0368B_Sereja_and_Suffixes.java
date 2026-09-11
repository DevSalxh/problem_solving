/*
 * ============================================================
 * Codeforces: B - Sereja and Suffixes
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Given an array and multiple queries, each query asks for the
 * number of distinct values in a suffix of the array.
 *
 * Example:
 *
 * Array:
 * [1, 2, 1, 3, 2]
 *
 * Query x asks:
 * How many distinct values exist from index x to the end?
 *
 * Idea:
 * Instead of calculating every suffix from scratch, process
 * the array from right to left.
 *
 * Maintain a set of values already encountered.
 * For every position i:
 *
 *     set.add(array[i])
 *     suffix[i] = set.size()
 *
 * Then every query can be answered in O(1).
 *
 * Algorithm:
 * 1. Traverse the array from right to left.
 * 2. Store distinct values in a HashSet.
 * 3. Store the current set size in suffix[i].
 * 4. Answer each query using suffix[x].
 *
 * Time Complexity: O(n + q) average
 * Space Complexity: O(n)
 * ============================================================
 */

import java.util.Scanner;
import java.util.HashSet;
 
public class B368_Sereja_and_Suffixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int[] ans = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            set.add(number[i]);
            ans[i] = set.size();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            sb.append(ans[q - 1]).append("\n");
        }
 
        System.out.print(sb);
    }
}