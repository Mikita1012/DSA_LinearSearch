public class BasicLS {

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 9, 12, 18, 23, 41, 56, 16};
        int target = 1;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
//    search in the array; return the index if item found
//    otherwise if item not found. return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;

    }
}
