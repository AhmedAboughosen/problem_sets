package com.problems;

public class LeastCommonMultiple {


    /**
     * learn more about https://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html algorithm
     * The Euclidean algorithm is a way to find the greatest common divisor of two positive integers, a and b. First let me show the computations for a=210 and b=45.
     * <p>
     * Divide 210 by 45, and get the result 4 with remainder 30, so 210=4·45+30.
     * Divide 45 by 30, and get the result 1 with remainder 15, so 45=1·30+15.
     * Divide 30 by 15, and get the result 2 with remainder 0, so 30=2·15+0.
     * The greatest common divisor of 210 and 45 is 15.
     * time complexity of algorithm is log(a+b)
     *
     * @param a
     * @param b
     * @return
     */
    public static int EuclideanAlgorithm(int a, int b) {
        if (b == 0) return a;
        return EuclideanAlgorithm(b, a % b);
    }

    public static void main(String[] args) {

        int a = 12 , b = 15;

        //Compute the Least Common Multiple
        System.out.println((a*b) / EuclideanAlgorithm(a , b));
    }
}
