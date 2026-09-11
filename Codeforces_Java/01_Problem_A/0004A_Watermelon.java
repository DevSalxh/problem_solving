/*
 * ============================================================
 * Codeforces: A - Watermelon
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Determine whether a watermelon of weight w can be divided
 * into two parts such that both parts have an even weight.
 *
 * Input:
 * An integer w.
 *
 * Output:
 * "YES" if the watermelon can be divided into two positive
 * even parts, otherwise "NO".
 *
 * Idea:
 * The total weight must be even.
 * Also, the smallest possible even split is 2 + 2 = 4.
 *
 * Algorithm:
 * Check:
 *      w % 2 == 0 && w > 2
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * ============================================================
 */

import java.util.Scanner;

public class A04_Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w % 2 == 0 && w > 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}