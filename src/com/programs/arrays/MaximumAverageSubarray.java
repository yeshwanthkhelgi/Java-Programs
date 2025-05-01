package com.programs.arrays;

public class MaximumAverageSubarray {
	
	public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(arr, 4));

	}

}
