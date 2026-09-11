/*
 * ============================================================
 * Codeforces: A - In Search of an Easy Problem
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Determine whether a problem is HARD or EASY based on opinions from n people.
 * If at least one person considers it hard (1), the problem is HARD; otherwise, it is EASY.
 *
 * Input:
 * n (number of people), followed by n integers (0 for easy, 1 for hard).
 *
 * Output:
 * "HARD" if at least one response is 1, otherwise "EASY".
 *
 * Idea:
 * Read responses sequentially. If any person answers 1, set a flag to mark
 * the problem as hard and break out of the loop early.
 *
 * Key conditions:
 * - response == 1 -> problem is HARD
 * - all responses == 0 -> problem is EASY
 *
 * Algorithm:
 * Read n and iterate through the inputs. Set a boolean flag to true and terminate 
 * the loop upon reading 1. Print "HARD" if the flag is true, otherwise "EASY".
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * ============================================================
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isHard = false;
        for (int i = 0; i < n; i++) {
            int response = scanner.nextInt();
            if (response == 1) {
                isHard = true;
                break;
            }
        }
        if (isHard)
            System.out.println("HARD");
        else
            System.out.println("EASY");

    }
}