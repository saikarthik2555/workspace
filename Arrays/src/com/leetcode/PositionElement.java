package com.leetcode;

public class PositionElement {
	public static void main(String[] args) {
		int arr[]=new int[] {5,7,7,8,8,10};
		System.out.println(Solution.searchRange(arr,10));
		
	}

}
class Solution {
    public static int[] searchRange(int[] nums, int target) {
    	int arr1[]= new int[nums.length];
    	for(int i=0;i<nums.length;i++) {
        	if(nums[i]==target) {
        		arr1[i]=i;
        	}
        }
     	return arr1;
    }
}