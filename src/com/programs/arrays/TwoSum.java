package com.programs.arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6};
        int target = 7;
        int start = -1;
        int end = -1;
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum==target){
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(start + " " + end);

	}

}
