package src.com.problems.binarySearch;

public class SqrtProblem {

    public static void main(String[] args) {
       System.out.println( mySqrt(16));
    }

    public static int mySqrt(int x) {


        double eps = 1e-9;

        double lo = 0, hi = x;
        while (hi - lo > eps) {
            double mid = lo + (hi - lo) / 2;

            if (mid * mid - x < 0.0) {
                lo = mid ;
            } else {
                hi = mid ;
            }

        }
        return (int)(lo + 1e-9);
    }
}
