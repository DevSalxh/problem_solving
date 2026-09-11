/*
 * ============================================================
 * Codeforces: A - Next Round
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Contestants advance to the next round if their score is greater than
 * or equal to the k-th place finisher's score, provided their score is positive (> 0).
 *
 * Find the total number of participants who advance.
 *
 * Input:
 * n and k followed by n scores in non-increasing order.
 *
 * Output:
 * Number of participants who advance to the next round.
 *
 * Idea:
 * The score of the k-th participant acts as the threshold. Since the array
 * is sorted in non-increasing order, we check which participants meet or exceed 
 * the threshold while maintaining a score strictly greater than zero.
 *
 * Key conditions:
 *
 * score >= score[k - 1]
 * score > 0
 *
 * Algorithm:
 * Store scores in an array, retrieve the threshold value at index k - 1,
 * and iterate through the array to count participants satisfying both conditions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * ============================================================
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int qualified = 0;
        int targetedScore = arr[k - 1]; // Cause kth place in index gonna be (k - 1)th 
        for (int x : arr){
            if (x >= targetedScore && x > 0)
                qualified ++;
        }
        System.out.println(qualified);
    }
}