package com._2d_array;

public class Array2D {
	public static void main(String[] args) {
		int rows=4;
		int columns=4;
		int value=1;
		int arr[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=value++;
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
