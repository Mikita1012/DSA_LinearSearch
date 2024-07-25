public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {124, 89, 90, 1231, 421344, 7654, 21111};
       int res =  findNumbers(arr);
        System.out.println("No of even digits in array are: "+res);
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if(even(arr[i])) {
               count++;
            }
        }
        return count;
    }


    static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }

//    count number of digites in a number
    static int digits(int num) {
        int count =0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
