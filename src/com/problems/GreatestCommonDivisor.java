package com.problems;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * The greatest common divisor (GCD), also called the greatest common factor, of two numbers is the largest number that divides them both.
 * For instance, the greatest common factor of 20 and 15 is 5, since 5 divides both 20 and 15 and no larger number has this property.
 * The concept is easily extended to sets of more than two numbers:
 * the GCD of a set of numbers is the largest number dividing each of them.
 * learn more https://brilliant.org/wiki/greatest-common-divisor/
 */
public class GreatestCommonDivisor {

    static int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293};

    public static long computeGreatestCommonDivisor(int... numbers) {


        ArrayList<PrimeFactorization> factorizationArrayList = new ArrayList<>();
        long sum = 1;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            ArrayList<PrimeFactorization> primeFactorizationArrayList = getPrimeFactorization(number, factorizationArrayList);
            factorizationArrayList = primeFactorizationArrayList;
        }

        for (int i = 0; i < factorizationArrayList.size(); i++) {
            double pow = Math.pow(factorizationArrayList.get(i).prime, factorizationArrayList.get(i).power);
            sum = sum * (long) pow;
        }
        return sum;
    }

    public static ArrayList<PrimeFactorization> getPrimeFactorization(int number, ArrayList<PrimeFactorization> previousList) {

        ArrayList<PrimeFactorization> primeFactorizations = new ArrayList<>();
        HashMap<Integer, PrimeFactorization> map = new HashMap<>();

        for (int i = 0; i < previousList.size(); i++) {
            map.put(previousList.get(i).prime, previousList.get(i));
        }


        int count = 0;
        for (int i = 0; i < primeNumbers.length && number > 1; i++) {
            while (number % primeNumbers[i] == 0) {
                ++count;
                number = number / primeNumbers[i];
            }
            if (map.containsKey(primeNumbers[i])) {
                primeFactorizations.add(new PrimeFactorization(primeNumbers[i], Math.min(map.get(primeNumbers[i]).power, count)));
            } else {
                if (previousList.size() == 0) {
                    primeFactorizations.add(new PrimeFactorization(primeNumbers[i], count));
                }
            }


            count = 0;
        }

        return primeFactorizations;
    }


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
        System.out.println(computeGreatestCommonDivisor(3918848, 1653264));
    }
}


class PrimeFactorization {
    public int prime;
    public int power;

    public PrimeFactorization(int prime, int power) {
        this.prime = prime;
        this.power = power;
    }
}
