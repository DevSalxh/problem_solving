/*
 * ============================================================
 * Algorithm: Binary Search
 * By: Zen1x_
 * ============================================================
 *
 * Idea:
 * Search for a target in a sorted array by repeatedly
 * dividing the search space in half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Important:
 * Binary Search requires the array to be sorted!
 * ============================================================
 */
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                right = mid - 1;
            } else 
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int itemToFind = scanner.nextInt();
        int index = binarySearch(array, itemToFind);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found At: " + index);
        }
    }
}