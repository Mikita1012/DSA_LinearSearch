import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr, target); //format of return value => {row, col}
        System.out.println("Element found at index: [row, col]: "+Arrays.toString(ans));
        int max = max(arr);
        System.out.println("Max value in array: "+max);
    }

    public static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }


}
