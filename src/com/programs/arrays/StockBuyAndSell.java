package com.programs.arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,3,6,4};
		System.out.println(stockBuyAndSell(arr));
		System.out.println(stockBuyAndSellOptimal(arr));
	}

	private static int stockBuyAndSellOptimal(int[] arr) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0;i < arr.length;i++) {
			minPrice = Math.min(minPrice, arr[i]);
			maxProfit = Math.max(maxProfit, arr[i] - minPrice);
		}
		return maxProfit;
	}

	private static int stockBuyAndSell(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int profit = 0;
		int maxProfit = 0;
		for(int i=0;i<n;i++) {	
			for(int j=i+1;j<n;j++) {
				profit = arr[j] - arr[i];
				maxProfit = Math.max(maxProfit, profit);
			}
			
		}
		
		return maxProfit;
		
	}

}
