package com.programs.arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {1, 1, 1, 1},
			    {1, 0, 0, 1},
			    {1, 1, 0, 1},
			    {1, 1, 1, 1}
			};
		int[][] arr1 = {
			    {1, 0, 1},
			    {1, 1, 1},
			    {1, 1, 1}
			};

		setMatrixZeroesOptimal(arr);
		}

	private static void setMatrixZeroesOptimal(int[][] arr) {
		// TODO Auto-generated method stub
		int m = arr.length;
		int n = arr[0].length;
		int col_0 = 1;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==0) {
					if(j==0) {
						col_0 = 0;
					}
					else {
						arr[0][j] = 0;
					}
					arr[i][0] = 0;
				}
			}
		}
		
		for(int i=m-1;i>0;i--) { // i=1;i<m;i++
			for(int j=n-1;j>0;j--) { //j=1;j<n;j++
				if(arr[i][j]!=0) {
					if(arr[i][0]==0 || arr[0][j]==0) {
						arr[i][j]=0;
					}
				}
				
			}
		}
		
		if(arr[0][0]==0) {
			for(int i=0;i<n;i++) {
				arr[0][i]=0;
			}
		}
		
		if(col_0==0) {
			for(int i=0;i<m;i++) {
				arr[i][0]=0;
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void setMatrixZeroesBruteForce(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==0) {
					markRow(arr,i,n);
					markColumn(arr,j,m);
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void markColumn(int[][] arr, int j, int m) {
		// TODO Auto-generated method stub
		for(int k=0;k<m;k++) {
			if(arr[k][j]!=0) {
				arr[k][j]=-1;
			}
		}
		
	}

	private static void markRow(int[][] arr, int i, int n) {
		// TODO Auto-generated method stub
		for(int k=0;k<n;k++) {
			if(arr[i][k]!=0) {
				arr[i][k]=-1;
			}
		}
	}

	private static void setMatrixZeroesBetter(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		int[] rows = new int[m];
		int[] cols = new int[n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(rows[i] == 1 || cols[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	}


