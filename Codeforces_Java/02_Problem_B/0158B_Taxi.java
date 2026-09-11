/*
 * ============================================================
 * Codeforces: B - Taxi
 * By: Zen1x_
 * ============================================================
 *
 * Problem:
 * Groups of 1, 2, 3, or 4 children need taxis.
 * Each taxi can carry at most 4 children.
 *
 * Find the minimum number of taxis required.
 *
 * Input:
 * n followed by n group sizes.
 *
 * Output:
 * Minimum number of taxis.
 *
 * Idea:
 * Process the largest groups first and optimally combine
 * smaller groups with them.
 *
 * Important combinations:
 *
 * 4                -> one taxi
 * 3 + 1            -> one taxi
 * 2 + 2            -> one taxi
 * 2 + 1 + 1        -> one taxi
 *
 * Remaining groups of 1 need to be grouped four per taxi.
 *
 * Algorithm:
 * Count groups of each size and greedily combine them.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * ============================================================
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class B158_Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            switch(value){
                case 1: count1 ++; break;
                case 2: count2 ++; break;
                case 3: count3 ++; break;
                case 4: count4 ++; break;
            }            
        }
        int taxiCount = count4;

        taxiCount += count3;
        count1 = Math.max(0,count1 - count3);

        taxiCount += count2/2;
        if (count2 % 2 !=0){
            taxiCount++;
            count1 = Math.max(0, count1 - 2);
        }

        if (count1 > 0){
            taxiCount += (count1 + 3)/4;
        }
        System.out.println(taxiCount);
    }
}