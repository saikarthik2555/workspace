package com.task;

public class Missing {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,9};
		Check(arr);
	}
	public static void Check(int arr[]) {
		int index=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==index) {
				index++;
			}
			else {
				System.out.print(index);
				break;
			
			}
		}
		
	}

}
