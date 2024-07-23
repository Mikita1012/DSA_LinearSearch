public class SearchInRange {
//    SEARCH AN ELEMENT FROM INDEX [X, Y]
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 9, 12, 18, 23, 41, 56, 16};
        int target = 16;
        int ans = searchByRange(nums, target, 0, 3);
        System.out.println(ans);
    }

    static int searchByRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }

        return -1;
    }


}
