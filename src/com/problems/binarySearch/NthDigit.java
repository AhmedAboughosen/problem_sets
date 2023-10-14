package src.com.problems.binarySearch;

public class NthDigit {


    public static void main(String[] args) {

        findDigits(11);
        System.out.println(findDigits(11));
    }

    private static int findDigits(int n)
    {
        // number_of_digits store total
        // digits we have to write
        int number_of_digits = 0;

        // In the loop we are decreasing
        // 0, 9, 99 ... from n till
        // ( n - i + 1 ) is greater than 0
        // and sum them to number_of_digits
        // to get the required sum
        for (int i = 1; i <= n; i *= 10)
            number_of_digits += (n - i + 1);

        return number_of_digits;
    }

    public static int findNthDigit(int n) {
        int start = 1, end = Integer.MAX_VALUE;


        long target = 0;
        while (start < end) {
            int mid = (start + (end - start) / 2) ;

            long possible = findDigits(mid);

            if (possible < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
                target = mid;
            }
        }

        return Integer.parseInt( String.valueOf(target).charAt(String.valueOf(target).length() - 1)+"");
    }
}
