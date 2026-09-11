/*
 * ============================================================
 * Codeforces: A - Beautiful Year
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Find the minimum year strictly greater than the given year y
 * that has all distinct digits.
 *
 * Input:
 * A single integer y (1000 <= y <= 9000).
 *
 * Output:
 * The smallest year strictly greater than y with distinct digits.
 *
 * Idea:
 * Increment year by 1 repeatedly and check digit uniqueness using a boolean 
 * frequency array. Since the maximum gap between distinct years is constant (<= 103),
 * the loop will terminate very quickly.
 *
 * Key conditions:
 * - year > y
 * - used[digit] must be false for all digits in the year
 *
 * Algorithm:
 * Increment year in a loop. For each year, extract digits using modulo and division,
 * tracking visited digits in a boolean array of size 10. Return false if a digit
 * repeats, otherwise print the year and break upon finding a valid one.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * ============================================================
 */
import java.util.Scanner;

public class Main {
    static boolean hasDistinctDigits(int year) {
        boolean[] used = new boolean[10];
        while (year > 0) {
            int digit = year % 10;
            if (used[digit]) {
                return false; 
            }
            used[digit] = true;
            year /= 10;
        }
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        
        while (true) {
            year++;
            if (hasDistinctDigits(year)) {
                System.out.println(year);
                break;
            }
        }
    }
}