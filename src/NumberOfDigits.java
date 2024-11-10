public class NumberOfDigits {
    public static void main(String[] args) {
        int arr[] = { 22,33,44,11,5456, 2122 ,2};
        int n = numberOfDigits(arr);
        System.out.println(numberOfDigits2(arr));
        System.out.print(n);
    }

//    1st way to calculate the number of digits in each and every element of an array.
    static int numberOfDigits(int[] n) {
        int count = 0;
        for(int element: n) {
            if(checkEvenNumberOfDigits(element)) {
                count++;
            }
        }
        return count;
    }
    static boolean checkEvenNumberOfDigits(int num) {
        if(num < 0) {
            num = num * -1;
        }
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }
//    2nd way to use the log method
static int numberOfDigits2(int[] n) {
    int count = 0;
    for(int element: n) {
       int num = (int)Math.log10(element) + 1;
       if(num % 2 == 0) {
           count++;
       }
    }
    return count;

}
}
