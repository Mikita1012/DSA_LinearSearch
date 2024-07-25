public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {124, 89, 90, 1231, 421344, 7654, 21111};
       int res =  findNumbers(arr);
        System.out.println("No of even digits in array are: "+res);

        System.out.println(digits2(1234));

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

//    count number of digits in a number
    static int digits(int num) {
        int count =0;

        if(num < 0) {
            num = num * -1;
        }
        if(num == 0) {
            return 1;
        }
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        } else if (num == 0) {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
