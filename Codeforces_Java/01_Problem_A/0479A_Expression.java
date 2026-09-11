/*
 * ============================================================
 * Codeforces: A - Expression
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Given three integers a, b, and c, find the maximum value
 * obtainable using the allowed arithmetic expressions.
 *
 * Input:
 * Three integers: a, b, c.
 *
 * Output:
 * The maximum possible value.
 *
 * Idea:
 * Because multiplication can produce a larger result than
 * addition, we need to evaluate all relevant expressions and
 * choose the maximum.
 *
 * Algorithm:
 * Calculate all valid expressions:
 *
 * a + b + c
 * a * b * c
 * (a + b) * c
 * a * (b + c)
 *
 * Then take the maximum.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * ============================================================
 */

import java.util.Scanner;

public class A479_Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int exp1 = a + b + c;
        int exp2 = a * b * c;
        int exp3 = a + b * c;
        int exp4 = a * b + c;
        int exp5 = a * (b + c);
        int exp6 = (a + b) * c;

        int max1 = Math.max(exp1, exp2);
        int max2 = Math.max(exp3, exp4);
        int max3 = Math.max(exp5, exp6);

        int result = Math.max(max1, Math.max(max2, max3));
        System.out.println(result);
    }
}