package src.com.problems.sortingAlgorithm;

import java.util.Arrays;

public class SortCharactersFrequency {




    public String frequencySort(String s) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        return  sorted;
    }
}
