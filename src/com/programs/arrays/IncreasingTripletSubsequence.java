package com.programs.arrays;

public class IncreasingTripletSubsequence {
	
	public static boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num: nums) {
            if (num <= smallest) {
                smallest = num;
            } else if (num <= secondSmallest) {
                secondSmallest = num;
            } else {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,5,0,4,6};
		System.out.println(increasingTriplet(nums));
	}

}
