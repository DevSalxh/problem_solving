/*
 * ============================================================
 * Codeforces: A - String Task
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Transform the given string by:
 *
 * 1. Converting uppercase letters to lowercase.
 * 2. Removing all vowels.
 * 3. Adding '.' before every remaining consonant.
 *
 * Vowels:
 * a, e, i, o, u, y
 *
 * Input:
 * A string containing lowercase and/or uppercase letters.
 *
 * Output:
 * The transformed string.
 *
 * Idea:
 * Traverse the string character by character.
 * Convert each character to lowercase.
 * If it is not a vowel, append '.' followed by the character.
 *
 * Algorithm:
 * String traversal + character filtering.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * ============================================================
 */

import java.util.Scanner;

public class A118_String_Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ch = new char[100];
        char[] v = {'a','e','i','o','u','y'};
        String word = scanner.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            sb.append(".");
            sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }

}