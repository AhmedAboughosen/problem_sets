package src.com.problems.binarySearch;

public class FindPeakElement {


    public static void main(String[] args) {

        findPeakElement(new int[]{3,5,6,7,1,2,3,5,1,1});
    }

    public static int findPeakElement(int[] nums) {
        int lo=0,hi = nums.length-1;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid] < nums[mid+1])
                lo = mid+1;
            else
                hi = mid;

        }
        return lo;
    }

}
